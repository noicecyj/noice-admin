import React, {useState} from 'react';
import {Button, Modal, Select} from 'antd';
import {DrawerForm, ProTable} from "@ant-design/pro-components";
import store from "@/store";
import {DataType} from "@ice/runtime";
import {TableRowSelection} from "antd/es/table/interface";

const {confirm} = Modal;

interface PageFormSelectProps {
  key: string,
  colProps?: { md: number | undefined },
  name?: string,
  label?: string,
  initialValue?: string | undefined,
  disabled?: boolean | undefined,
  dataSource?: string | undefined
}

interface Option {
  label: string,
  value: string
}

const PageFormSelect = ({colProps, name, label, initialValue, disabled, key, dataSource = ""}: PageFormSelectProps) => {
  const [visible, setVisible] = useState(false);
  const [searchValue, setSearchValue] = useState('');
  const [fetching, setFetching] = useState(false);

  const [selectedRowKeys, setSelectedRowKeys] = useState<React.Key[]>([]);

  const [options, setOptions] = useState<Option[]>([]);
  const [entityState, entityDispatcher] = store.useModel('entity');

  console.log('PageFormSelect', colProps, name, label, initialValue, disabled, key);

  const handleOk = async () => {
    setVisible(false);
    // 你可以在这里处理选择后的逻辑
  };

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
        value={selectedRowKeys}
      />
      <DrawerForm
        title="选择"
        width={window.innerWidth * 0.3}
        trigger={
          <Button disabled={disabled}>
            选择
          </Button>
        }
        autoFocusFirstInput
        drawerProps={{
          destroyOnClose: true,
        }}
        submitTimeout={2000}
        onFinish={async () => {
          await handleOk()
          return true;
        }}
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
              return new Promise((resolve, reject) => {
                resolve(res);
              });
            });
          }}
          rowKey="value"
          pagination={{
            pageSize: 10,
          }}
          loading={fetching}
          dateFormatter="string"
          search={{
            labelWidth: 'auto',
          }}
        />
      </DrawerForm>
    </div>
  );
};

export default PageFormSelect;