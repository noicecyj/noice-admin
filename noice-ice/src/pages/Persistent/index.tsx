import pageStore from './store';
import DataTable from "@/components/DataTable";
import DataForm from "@/components/DataForm";
import {defineDataLoader} from "@ice/runtime/data-loader";
import {getForm, getTable, getUrl} from "@/services/formAndTableAndUrl";
import {useData} from "@ice/runtime/router";

interface PersistentItem {
  appServiceId: string;
  persistentCode: string;
  persistentId: string;
  persistentName: string;
  persistentType: string;
}

export default function Persistent() {

  const [persistentState, persistentDispatchers] = pageStore.useModel('Persistent');
  const [form, table, url] = useData();

  return (
    <>
      <DataTable<PersistentItem>
        tableColumns={table.data.tableConfigVoList}
        url={url.data}
      />
      <DataForm<PersistentItem>
        url={url.data}
        config={form.data}
      />
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
  async (ctx) => {
    return await getUrl(ctx.pathname);
  },
]);

// export const pageConfig = definePageConfig(() => {
//     return {
//         auth: ['admin'],
//     };
// });
