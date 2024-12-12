import type {ActionType} from '@ant-design/pro-components';
import {ProTable} from '@ant-design/pro-components';
import {ReactNode, useRef} from 'react';
import store from "@/store";
import {ProColumns} from "@ant-design/pro-table/lib";
import {Button} from "antd";

function DataTable<T extends Record<string, any>>(props: {
  tableColumns: ProColumns[],
  toolBar?: ReactNode[],
  url?: {
    page: string,
  }
}) {
  const actionRef = useRef<ActionType>();

  const [entityState, entityDispatcher] = store.useModel('entity');

  const {
    tableColumns,
    toolBar = [],
    url = {
      page: ''
    },
  } = props;

  const tableColumnsOption = tableColumns.concat({
    title: '操作',
    width: 150,
    valueType: 'option',
    key: 'option',
    render: (text, record, index, action) => [
      <Button key="edit" size="small" onClick={() => {
        console.log(record);
        entityDispatcher.edit(record);
      }}
      >
        编辑
      </Button>,
      <Button key="view" size="small">
        查看
      </Button>,
      <Button danger key="delete" size="small">
        删除
      </Button>
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
      <ProTable<T>
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
        options={{
          setting: {
            listsHeight: 400,
          },
        }}
        form={{
          // 由于配置了 transform，提交的参数与定义的不同这里需要转化一下
          syncToUrl: (values, type) => {
            if (type === 'get') {
              return {
                ...values,
                created_at: [values.startTime, values.endTime],
              };
            }
            return values;
          },
        }}
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