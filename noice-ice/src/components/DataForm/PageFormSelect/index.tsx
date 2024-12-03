import {ActionType, ModalForm, ProTable,} from '@ant-design/pro-components';
import store from "@/store";
import {useRef} from "react";

function PageFormSelect<T extends Record<string, any>>(props: {
  tableColumns: any[]
}) {

  const actionRef = useRef<ActionType>();

  const [entityState, entityDispatcher] = store.useModel('entity');


  return (
    <>
      <ModalForm
        // @ts-ignore
        labelWidth="auto"
      >
        <ProTable<T>
          columns={props.tableColumns}
          actionRef={actionRef}
          cardBordered
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
              pageUrl: "/entityCreateApi/Persistent/page"
            });
          }}
          editable={{
            type: 'multiple',
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
          headerTitle="选择"
        />
      </ModalForm>
    </>
  );
}

export default PageFormSelect;
