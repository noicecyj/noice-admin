import type {ProColumns} from '@ant-design/pro-components';
import {Button} from 'antd';
import pageStore from './store';
import DataTable from "@/components/DataTable";
import DataForm from "@/components/DataForm";
import {PlusOutlined} from "@ant-design/icons";
import {defineDataLoader} from "@ice/runtime/data-loader";
import {getForm, getTable} from "@/services/formAndTableAndUrl";
import {useData} from "@ice/runtime/router";

type PersistentItem = {
  appServiceId: string;
  persistentCode: string;
  persistentId: string;
  persistentName: string;
  persistentType: string;
};

export default function Persistent() {

  const [persistentState, persistentDispatchers] = pageStore.useModel('Persistent');
  const [form, table] = useData();
  console.log("dataLoader.form", form.data);
  console.log("dataLoader.table", table.data.tableConfigVoList);
  return (
    <>
      <DataTable<PersistentItem>
        states={persistentState}
        search={() => {
          return persistentDispatchers.page(persistentState)
        }}
        tableColumns={table.data.tableConfigVoList}
        toolBar={[
          <Button
            key="button"
            onClick={() => {
              console.log("click")
              persistentDispatchers.setState({visible: true})
            }}
            type="primary"
          >
            新建
          </Button>
        ]}/>
      <DataForm
        config={form.data}
        dispatchers={persistentDispatchers}
        state={persistentState}/>
    </>
  );
}

export const dataLoader = defineDataLoader([
  async (ctx) => {
    return await getForm(ctx.pathname);
  },
  async (ctx) => {
    return await getTable(ctx.pathname);
  },
]);

// export const pageConfig = definePageConfig(() => {
//     return {
//         auth: ['admin'],
//     };
// });
