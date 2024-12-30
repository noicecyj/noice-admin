import {defineDataLoader} from "@ice/runtime/data-loader";
import {getForm, getTable, getUrl} from "@/services/formAndTableAndUrl";
import {useData} from "@ice/runtime/router";
import PageModel from "@/components/PageModel";
import pageStore from "@/pages/Persistent/store";

export default function PersistentProperty() {

  const [form, table, url] = useData();
  const [infoState, infoDispatchers] = pageStore.useModel('Info');

  return (
    <PageModel
      infoState={infoState}
      infoDispatchers={infoDispatchers}
      url={url}
      table={table}
      form={form}
    />
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
