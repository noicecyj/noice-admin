import type {ActionType} from '@ant-design/pro-components';
import {ProTable} from '@ant-design/pro-components';
import {ReactNode, useEffect, useRef} from 'react';
import store from "@/store";
import {ProColumns} from "@ant-design/pro-table/lib";
import {Button, Popconfirm} from "antd";

function DataTable(props: {
  tableColumns: ProColumns[],
  toolBar?: ReactNode[],
  url?: {
    page: string,
    get: string,
    delete: string,
  },
}) {
  const actionRef = useRef<ActionType>();
  const [entityState, entityDispatcher] = store.useModel('entity');

  useEffect(() => {
    console.log('Count changed to:', entityState.status);
    if (entityState.status === 'page') {
      actionRef?.current?.reload();
    }
  }, [entityState.status]);

  const {
    tableColumns,
    toolBar = [],
    url = {
      page: '',
      get: '',
      delete: '',
    },
  } = props;

  const tableColumnsOption = tableColumns.concat({
    title: '操作',
    width: 150,
    valueType: 'option',
    key: 'option',
    render: (text, record, index, action) => [
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


  return (
    <>
      <ProTable
        columns={tableColumnsOption}
        actionRef={actionRef}
        cardBordered
        request={async (params) => {
          return entityDispatcher.page({
            params: params,
            pageUrl: url.page,
          });
        }}
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
          pageSize: 11,
          onChange: (page) => console.log(page),
        }}
        dateFormatter="string"
        headerTitle="实体"
        toolBarRender={() => toolBar.concat(addButton)}
      />
    </>
  );
}

export default DataTable;