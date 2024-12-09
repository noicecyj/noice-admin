import React, {useState} from 'react';
import {Button, Drawer, Select, Space} from 'antd';
import {ProTable} from "@ant-design/pro-components";
import store from "@/store";
import {DataType} from "@ice/runtime";
import {TableRowSelection} from "antd/es/table/interface";

interface PageFormSelectProps {
  key: string,
  colProps?: { md: number | undefined },
  name?: string,
  label?: string,
  initialValue?: string | undefined,
  disabled?: boolean | undefined,
  dataSource?: string | undefined,
  value?: [],
  onChange?: (value: React.Key) => void
}

interface Option {
  label: string,
  value: string
}

const PageFormSelect = ({
                          colProps,
                          name,
                          label,
                          initialValue,
                          disabled,
                          key,
                          dataSource = "",
                          value = [],
                          onChange
                        }: PageFormSelectProps) => {

  const handleChange = (newValue: React.Key[]) => {
    if (onChange) {
      onChange(newValue[0]);
    }
  };

  const [open, setOpen] = useState(false);

  const showDrawer = () => {
    setOpen(true);
  };

  const onClose = () => {
    handleChange(selectedRowKeys)
    setOpen(false);
  };
  const [selectedRowKeys, setSelectedRowKeys] = useState<React.Key[]>([]);
  const [options, setOptions] = useState<Option[]>([]);
  const entityDispatcher = store.useModelDispatchers('entity');

  console.log('PageFormSelect', colProps, name, label, initialValue, disabled, key);

  const onSelectChange = (newSelectedRowKeys: React.Key[]) => {
    console.log('selectedRowKeys changed: ', newSelectedRowKeys);
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
      <Select
        options={options}
        disabled={true}
        value={value}
        onChange={handleChange}
      />
      <Button disabled={disabled} onClick={showDrawer}>
        选择
      </Button>
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
          request={async (
            // 第一个参数 params 查询表单和 params 参数的结合
            // 第一个参数中一定会有 pageSize 和  current ，这两个参数是 antd 的规范
            params
          ) => {
            // 这里需要返回一个 Promise,在返回之前你可以进行数据转化
            // 如果需要转化参数可以在这里进行修改
            return entityDispatcher.page({
              params: params,
              pageUrl: "/entityCreateApi/" + dataSource + "/getOptions"
            }).then(res => {
              setOptions(res.data);
              return new Promise((resolve) => {
                resolve(res);
              });
            });
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