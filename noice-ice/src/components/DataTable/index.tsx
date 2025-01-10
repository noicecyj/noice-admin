import type {ActionType} from '@ant-design/pro-components';
import {ProTable} from '@ant-design/pro-components';
import React, {ReactNode, useEffect, useRef} from 'react';
import store from "@/store";
import {ProColumns} from "@ant-design/pro-table/lib";
import {Button, Popconfirm, Tabs} from "antd";
import {history} from "ice";

function DataTable(props: {
  table: {
    persistentTableName: string,
    tableConfigVoList: ProColumns[],
  }
  toolBar?: ReactNode[],
  url?: {
    page: string,
    get: string,
    delete: string,
  },
  infoState: any,
  infoDispatchers: any
}) {
  const actionRef = useRef<ActionType>();

  const [entityState, entityDispatcher] = store.useModel('entity');
  const [userState, userDispatcher] = store.useModel('user');
  useEffect(() => {
    console.log('Count changed to:', entityState.status);
    if (entityState.status === 'page') {
      actionRef?.current?.reload();
    }
  }, [entityState.status]);

  useEffect(() => {
    if (!userState.tabs?.some(tab => tab.key === infoState.code)) {
      console.log('tab not exist');
      userDispatcher.updateTabs(userState.tabs?.concat({
        key: infoState.code,
        label: infoState.name,
        closable: true,
      }));
      userDispatcher.updateActiveKey(infoState.code);
    }
  }, []);

  const {
    table,
    toolBar = [],
    url = {
      page: '',
      get: '',
      delete: '',
    },
    infoState,
    infoDispatchers,
  } = props;

  const tableColumnsOption = table.tableConfigVoList.concat({
    title: '操作',
    width: 150,
    valueType: 'option',
    key: 'option',
    render: (text, record) => [
      <Button key="edit" size="small" onClick={() => {
        entityDispatcher.edit({
          id: record.id,
          getUrl: url.get,
          readonly: false,
        });
      }}
      >
        编辑
      </Button>,
      <Button key="view" size="small" onClick={() => {
        entityDispatcher.edit({
          id: record.id,
          getUrl: url.get,
          readonly: true,
        });
      }}>
        查看
      </Button>,
      <Popconfirm
        title="删除"
        description="是否确认删除？"
        onConfirm={async () => {
          await entityDispatcher.remove({
            id: record.id,
            deleteUrl: url.delete,
          })
          actionRef?.current?.reload();
        }}
      >
        <Button danger key="delete" size="small" onClick={() => {
          console.log(record);
        }}>
          删除
        </Button>
      </Popconfirm>
    ],
  });

  const addButton: ReactNode = <Button
    key="button"
    onClick={() => {
      console.log("click")
      entityDispatcher.add();
    }}
    type="primary"
  >
    新建
  </Button>

  const onChange = (key: string) => {
    history?.push('/' + key);
    userDispatcher.updateActiveKey(key);
  };

  const remove = (targetKey: any) => {
    console.log('targetKey', targetKey)
    const targetIndex = userState.tabs?.findIndex((pane) => pane.key === targetKey);
    const newPanes = userState.tabs?.filter((pane) => pane.key !== targetKey);
    if (newPanes?.length && targetKey === userState.activeKey) {
      // @ts-ignore
      const {key} = newPanes[targetIndex === newPanes.length ? targetIndex - 1 : targetIndex];
      userDispatcher.updateActiveKey(key);
    }
    userDispatcher.updateTabs(newPanes);
  };

  const onEdit = (targetKey: any) => {
    remove(targetKey);
  };


  return (
    <>
      <Tabs
        hideAdd
        type="editable-card"
        activeKey={userState.activeKey}
        items={userState.tabs}
        onChange={onChange}
        onEdit={onEdit}
      />
      <ProTable
        columns={tableColumnsOption}
        actionRef={actionRef}
        cardBordered={false}
        request={async (params) => {
          return entityDispatcher.page({
            params: params,
            pageUrl: url.page,
          });
        }}
        defaultSize={'small'}
        columnsState={{
          persistenceKey: 'pro-table-singe-demos',
          persistenceType: 'localStorage',
          defaultValue: {
            option: {
              fixed: 'right',
              disable: true
            },
          },
          onChange(value) {
            console.log('value: ', value);
          },
        }}
        // rowKey="id"
        search={{
          labelWidth: 'auto',
        }}
        options={false}
        pagination={{
          pageSize: 10,
          onChange: (page) => console.log(page),
        }}
        dateFormatter="string"
        headerTitle={table.persistentTableName}
        toolBarRender={() => toolBar.concat(addButton)}
      />
    </>
  );
}

export default DataTable;