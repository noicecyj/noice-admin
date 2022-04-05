import React, {useEffect} from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnCatalog} from '@/pages/Catalog/view/custom/catalog';

function Catalog() {
  const [catalogState, catalogDispatchers] = pageStore.useModel('catalog');
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

  const [customCatalogState, customCatalogDispatchers] = pageStore.useModel('customCatalog');

  useEffect(() => {
    catalogDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [catalogDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => catalogDispatchers.catalogAdd()}
        editItem={record => catalogDispatchers.catalogEdit(record)}
        deleteItem={record => catalogDispatchers.catalogDelete({
          record,
          data: {
            pageNumber: catalogState.catalogCurrent,
          },
        })}
        visibleLoading={catalogState.catalogLoadingVisible}
        dataSource={catalogState.catalogTableData}
        items={catalogState.catalogTable}
        total={catalogState.catalogTotal}
        getPage={catalogCurrent => catalogDispatchers.catalogPage(catalogCurrent)}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            catalogDispatchers.setState({catalogId: record.id});
            dictionaryDispatchers.onRowClick({selected, record});
          },
          selectedRowKeys: [
            dictionaryState.catalogId,
          ],
        }}
        primaryKey="id"
        customType={catalogState.customType}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnCatalog value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customCatalogDispatchers.customMethod1()}
        customMethod2={() => customCatalogDispatchers.customMethod2()}
        customMethod3={() => customCatalogDispatchers.customMethod3()}
        customMethodName1={customCatalogState.customMethodName1}
        customMethodName2={customCatalogState.customMethodName2}
        customMethodName3={customCatalogState.customMethodName3}
      />
      <DataFormTemple
        formType={catalogState.formType}
        customType={catalogState.customType}
        title={catalogState.catalogTitle}
        visibleDialog={catalogState.catalogVisible}
        onClose={() => catalogDispatchers.setState({catalogVisible: false})}
        items={catalogState.catalogForm}
        dispatchers={value => catalogDispatchers.setDataForm(value)}
        onOk={() => catalogDispatchers.catalogSave({
          catalogFormData: catalogState.catalogFormData,
          pageNumber: catalogState.catalogCurrent,
        })}
        formDataValue={catalogState.catalogFormData}
      />
    </>
  );
}

export default Catalog;
