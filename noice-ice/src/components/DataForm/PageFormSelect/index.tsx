import React, {useState} from 'react';
import {Button, Input, Modal} from 'antd';
import debounce from 'lodash/debounce';
import {DrawerForm, ProTable} from "@ant-design/pro-components";
import {PlusOutlined} from "@ant-design/icons";

const {confirm} = Modal;

interface PageFormSelectProps {
  key: string,
  colProps?: { md: number | undefined },
  name?: string,
  label?: string,
  initialValue?: string | undefined,
  disabled?: boolean | undefined
}

const PageFormSelect = ({colProps, name, label, initialValue, disabled, key}: PageFormSelectProps) => {
  const [visible, setVisible] = useState(false);
  const [searchValue, setSearchValue] = useState('');
  const [fetching, setFetching] = useState(false);

  console.log('PageFormSelect', colProps, name, label, initialValue, disabled, key);
  // 模拟 API 请求
  const fetchData = async (params) => {
    setFetching(true);
    // 模拟延时
    setTimeout(() => {
      setFetching(false);
      // 你可以在这里替换成你的真实 API 请求
      const data = Array.from({length: 10}, (_, i) => ({
        key: i,
        name: `Item ${i + 1}`,
        age: Math.floor(Math.random() * 100),
        address: 'Some Address',
      })).filter(item => item.name.includes(params.search || ''));

      return {
        success: true,
        data: data.slice((params.current - 1) * params.pageSize, params.current * params.pageSize),
        total: data.length,
      };
    }, 1000);
  };

  const handleSearch = debounce((value) => {
    // 你可以在这里处理输入框的搜索逻辑，比如调用 API 获取数据
    console.log('Search Value:', value);
  }, 800);

  const handleOpenModal = () => {
    setVisible(true);
  };

  const handleOk = async () => {
    setVisible(false);
    // 你可以在这里处理选择后的逻辑
  };

  const handleCancel = () => {
    setVisible(false);
  };

  const columns = [
    {
      title: 'Name',
      dataIndex: 'name',
      key: 'name',
    },
    {
      title: 'Age',
      dataIndex: 'age',
      key: 'age',
    },
    {
      title: 'Address',
      dataIndex: 'address',
      key: 'address',
    },
  ];

  return (
    <div style={{display: 'flex', alignItems: 'center'}}>
      <Input disabled={disabled}/>
      <DrawerForm<{
        name: string;
        company: string;
      }>
        title="选择"
        width={window.innerWidth * 0.8}
        // resize={{
        //   onResize() {
        //     console.log('resize!');
        //   },
        //   maxWidth: window.innerWidth * 0.8,
        //   minWidth: 300,
        // }}
        trigger={
          <Button>
            选择
          </Button>
        }
        autoFocusFirstInput
        drawerProps={{
          destroyOnClose: true,
        }}
        submitTimeout={2000}
        onFinish={async (values) => {
          handleOk()
          // 不返回不会关闭弹框
          return true;
        }}
      >
        <ProTable
          columns={columns}
          request={(params) => fetchData(params)}
          rowKey="key"
          pagination={{
            pageSize: 5,
          }}
          loading={fetching}
          dateFormatter="string"

        />
      </DrawerForm>
    </div>
  );
};

export default PageFormSelect;