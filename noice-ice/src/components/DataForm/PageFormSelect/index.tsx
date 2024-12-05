import React, {useState} from 'react';
import {Button, Input, Modal} from 'antd';
import debounce from 'lodash/debounce';
import {DrawerForm, ProTable} from "@ant-design/pro-components";
import store from "@/store";
import _ from "lodash";

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

const PageFormSelect = ({colProps, name, label, initialValue, disabled, key, dataSource = ""}: PageFormSelectProps) => {
  const [visible, setVisible] = useState(false);
  const [searchValue, setSearchValue] = useState('');
  const [fetching, setFetching] = useState(false);


  const [entityState, entityDispatcher] = store.useModel('entity');

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

  const columns = (code: string) => [
    {
      title: '名称',
      dataIndex: _.lowerFirst(code) + 'Name',
      key: 'name',
    },
    {
      title: '编码',
      dataIndex: _.lowerFirst(code) + 'Code',
      key: 'age',
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
          columns={columns(dataSource)}
          request={async (
            // 第一个参数 params 查询表单和 params 参数的结合
            // 第一个参数中一定会有 pageSize 和  current ，这两个参数是 antd 的规范
            params,
            sort,
            filter
          ) => {
            // 这里需要返回一个 Promise,在返回之前你可以进行数据转化
            // 如果需要转化参数可以在这里进行修改
            return entityDispatcher.page({
              params: params,
              pageUrl: "/entityCreateApi/" + dataSource + "/page"
            });
          }}
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