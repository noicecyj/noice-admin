import React, {useState} from 'react';
import {Button, Drawer, Select, Space} from 'antd';
import {ProTable} from "@ant-design/pro-components";
import store from "@/store";
import {DataType} from "@ice/runtime";
import {TableRowSelection} from "antd/es/table/interface";
import {LabeledValue} from "antd/es/select";

interface Option {
  label: string,
  value: string
}

interface PageFormSelectProps {
  key: string,
  disabled?: boolean | undefined,
  dataSource?: Option[],
  value?: React.Key | LabeledValue,
  onChange?: (value: React.Key | LabeledValue) => void,
  readonly?: boolean
}


const PageFormSelect = ({
                          disabled,
                          key,
                          dataSource = [],
                          value = '',
                          onChange,
                          readonly
                        }: PageFormSelectProps) => {

  const handleChange = (newValue: React.Key | LabeledValue) => {
    if (onChange) {
      onChange(newValue);
    }
  };

  const readOnlyCheck = (readonly: boolean) => {
    if (readonly) {
      return (<div key={key}>
        {options.map(option => {
          if (option.value === value) {
            return (<div>{option.label}</div>)
          } else {
            return (<div></div>)
          }
        })}
      </div>)
    } else {
      return (<>
        <Select
          key={key}
          options={options}
          disabled={true}
          value={value}
          onChange={handleChange}/>
        <Button disabled={disabled} onClick={showDrawer}>
          选择
        </Button>
      </>)
    }
  }

  const [open, setOpen] = useState(false);

  const showDrawer = () => {
    setOpen(true);
  };

  const onClose = () => {
    handleChange(selectedRowKeys[0])
    setOpen(false);
  };

  const [selectedRowKeys, setSelectedRowKeys] = useState<React.Key[]>([]);

  const [options] = useState<Option[]>(dataSource);

  const entityDispatcher = store.useModelDispatchers('entity');

  const onSelectChange = (newSelectedRowKeys: React.Key[]) => {
    setSelectedRowKeys(newSelectedRowKeys);
  };

  const rowSelection: TableRowSelection<DataType> = {
    selectedRowKeys,
    onChange: onSelectChange,
  };

  const columns = [
    {
      title: '名称',
      dataIndex: 'label',
      key: 'label',
    },
  ];

  return (
    <div style={{display: 'flex', alignItems: 'center'}}>
      {readOnlyCheck(typeof readonly === "boolean" ? readonly : false)}
      <Drawer
        title="选择"
        width={window.innerWidth * 0.3}
        onClose={onClose}
        open={open}
        extra={
          <Space>
            <Button onClick={onClose}>取消</Button>
            <Button type="primary" onClick={onClose}>
              确认
            </Button>
          </Space>
        }
      >
        <ProTable
          columns={columns}
          rowSelection={{
            type: 'radio',
            ...rowSelection
          }}
          request={async (params) => {
            console.log(params);
            return entityDispatcher.setPageData({
              data: {
                records: options,
                total: options.length,
              },
              code: 200,
            })
          }}
          rowKey="value"
          pagination={{
            pageSize: 10,
          }}
          dateFormatter="string"
          search={{
            labelWidth: 'auto',
          }}
        />
      </Drawer>
    </div>
  );
};

export default PageFormSelect;