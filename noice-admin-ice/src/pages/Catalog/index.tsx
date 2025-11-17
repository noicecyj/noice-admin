import {defineDataLoader} from "@ice/runtime/data-loader";
import {getForm, getTable, getUrl} from "@/services/formAndTableAndUrl";
import {useData} from "@ice/runtime/router";
import PageModel from "@/components/PageModel";
import pageStore from "@/pages/Catalog/store";

export default function Catalog() {

  const [form, table, url, subForm, subTable, subUrl] = useData();
  const [catalogState, catalogDispatchers] = pageStore.useModel('Catalog');
  const [catalogDictionaryState, catalogDictionaryDispatchers] = pageStore.useModel('CatalogDictionary');

  return (
    <PageModel
      infoState={catalogState}
      subInfoState={[catalogDictionaryState]}
      infoDispatchers={catalogDispatchers}
      subInfoDispatchers={[catalogDictionaryDispatchers]}
      url={url}
      table={table}
      form={form}
      subUrl={subUrl}
      subTable={subTable}
      subForm={subForm}
    />
  );
}

export const dataLoader = defineDataLoader([
  async () => {
    return await getForm('Catalog');
  },
  async () => {
    return await getTable('Catalog');
  },
  async () => {
    return await getUrl('Catalog');
  },
  async () => {
    return await getForm('CatalogDictionary');
  },
  async () => {
    return await getTable('CatalogDictionary');
  },
  async () => {
    return await getUrl('CatalogDictionary');
  },
]);
