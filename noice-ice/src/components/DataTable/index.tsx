import type {ActionType} from '@ant-design/pro-components';
import {ProTable} from '@ant-design/pro-components';
import {ReactNode, useRef} from 'react';
import store from "@/store";


function DataTable<T extends Record<string, any>>(props: {
  tableColumns: any,
  toolBar: ReactNode[],
  url?: []
}) {
  const actionRef = useRef<ActionType>();

  const [entityState, entityDispatcher] = store.useModel('entity');

  const {
    tableColumns,
    toolBar,
  } = props;

  return (
    <>
      <ProTable<T>
        columns={tableColumns}
        actionRef={actionRef}
        cardBordered
        request={async (params) => {
          return entityDispatcher.page({
            params: params,
            pageUrl: "/entityCreateApi/Persistent/page"
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
        toolBarRender={() => toolBar}
      />
    </>
  );
}

export default DataTable;