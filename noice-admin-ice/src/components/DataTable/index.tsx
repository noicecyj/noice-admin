import type {ActionType} from '@ant-design/pro-components';
import {ProTable} from '@ant-design/pro-components';
import React, {ReactNode, useEffect, useRef, useState} from 'react';
import store from "@/store";
import {ProColumns} from "@ant-design/pro-table/lib";
import {Button, Modal, Popconfirm, Tabs} from "antd";
import {history} from "ice";

function DataTable(props: {
  table: {
    persistentTableName: string,
    tableConfigVoList: ProColumns[],
  },
  subTable: {
    persistentTableName: string,
    tableConfigVoList: ProColumns[],
  },
  toolBar?: ReactNode[],
  url?: {
    page: string,
    get: string,
    delete: string,
  },
  infoState: any,
  infoDispatchers: any
  subUrl?: {
    page: string,
    get: string,
    delete: string,
  },
  subInfoState?: [any],
  subInfoDispatchers?: [any],
}) {
  const actionRef = useRef<ActionType>();
  const [entityState, entityDispatcher] = store.useModel('entity');
  const [userState, userDispatcher] = store.useModel('user');
  // 添加状态用于控制弹窗显示
  const [isModalVisible, setIsModalVisible] = useState(false);
  const [selectedRecord, setSelectedRecord] = useState<any>(null);
  // 添加一个刷新标志，用于强制ProTable重新加载数据
  const [refreshKey, setRefreshKey] = useState(0);

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
    }
    userDispatcher.updateActiveKey(infoState.code);
  }, []);

  const {
    table,
    toolBar = [],
    url = {
      page: '',
      get: '',
      delete: '',
    },
    subTable,
    infoState,
    infoDispatchers,
    subUrl = {
      page: '',
      get: '',
      delete: '',
    },
  } = props;

  // 打开子表数据弹窗
  const showSubTableModal = async (record: any) => {
    setSelectedRecord(record);
    // 更新刷新标志，强制ProTable重新加载数据
    setRefreshKey(prev => prev + 1);
    // 移除加载状态，因为ProTable会自动处理加载状态
    setIsModalVisible(true);
  };

  // 关闭弹窗
  const handleModalClose = () => {
    setIsModalVisible(false);
    setSelectedRecord(null);
  };

  const tableColumnsOption = table.tableConfigVoList.concat({
    title: '操作',
    width: 150,
    valueType: 'option',
    key: 'option',
    render: (text, record) => {
      // 创建操作按钮数组
      const actions = [
        <Button key="edit" size="small" onClick={() => {
          entityDispatcher.edit({
            id: record.id,
            getUrl: url.get,
            readonly: false,
          });
        }}
        >
          编辑
        </Button>
      ];

      // 只有在subInfoState和subInfoDispatchers都存在的情况下才添加"查看"按钮
      if (props.subInfoState && props.subInfoDispatchers) {
        actions.push(
          <Button key="view" size="small" onClick={() => {
            showSubTableModal(record);
          }}>
            查看
          </Button>
        );
      }

      // 添加删除按钮
      actions.push(
        <Popconfirm
          title="删除"
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
      );

      return actions;
    },
  });

  const subTableColumnsOption = subTable.tableConfigVoList;

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

  // 添加页面大小配置选项
  const [pageSize, setPageSize] = useState(10); // 默认页面大小为10

  // 处理页面大小变化
  const handlePageSizeChange = (current: number, size: number) => {
    setPageSize(size);
  };

  // 在主表和子表中使用相同的分页配置
  const paginationConfig = {
    pageSize: pageSize,
    showSizeChanger: true, // 显示页面大小选择器
    pageSizeOptions: ['10', '20', '50', '100'], // 可选的页面大小选项
    onChange: (page) => console.log(page),
    onShowSizeChange: handlePageSizeChange, // 处理页面大小变化
  };

  // 渲染子表数据内容
  const renderSubTableContent = () => {
    return (
      <div>
        <ProTable
          key={refreshKey} // 使用refreshKey作为key，当它改变时，ProTable会重新渲染并触发请求
          columns={subTableColumnsOption}
          cardBordered={false}
          request={async (params) => {
            // 使用通用的entityDispatcher.page方法查询子表数据
            // 合并父表ID到查询参数中，并使用子表的URL
            return entityDispatcher.page({
              params: {
                ...params,
                parentId: selectedRecord?.id // 传递父表ID作为查询条件
              },
              pageUrl: subUrl.page // 使用子表专用的URL
            });
          }}
          rowKey="id"
          pagination={paginationConfig}
          options={false}
          size="small"
        />
      </div>
    );
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
        pagination={paginationConfig}
        dateFormatter="string"
        headerTitle={table.persistentTableName}
        toolBarRender={() => toolBar.concat(addButton)}
      />

      {/* 子表数据弹窗 */}
      <Modal
        title={`查看 - ${selectedRecord?.name || table.persistentTableName}`}
        open={isModalVisible}
        onCancel={handleModalClose}
        footer={[
          <Button key="close" onClick={handleModalClose}>
            关闭
          </Button>
        ]}
        width="90%"
      >
        {renderSubTableContent()}
      </Modal>
    </>
  );
}

export default DataTable;
