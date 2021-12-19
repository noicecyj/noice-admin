/* eslint-disable no-unused-vars */
import { ResponsiveGrid, Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import CustomCatalog from '@/pages/Catalog/view/custom/catalog';
import styles from './index.module.scss';

const { Cell } = ResponsiveGrid;

function Catalog() {
  const [catalogState, catalogDispatchers] = pageStore.useModel('catalog');
  const [customCatalogState, customCatalogDispatchers] = pageStore.useModel('customCatalog');
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');
  const [customDictionaryState, customDictionaryDispatchers] = pageStore.useModel('customDictionary');

  useEffect(() => {
    catalogDispatchers.findDataTableAndFormByName();
  }, [catalogDispatchers]);

  const catalogPageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => catalogDispatchers.catalogEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => catalogDispatchers.catalogDelete({
        record,
        catalogCurrent: catalogState.catalogCurrent,
        catalogTable: catalogState.catalogTable,
        catalogForm: catalogState.catalogForm,
      }),
    });
  };

  const catalogOperationRender = (value, index, record) => {
    return (
      <div className={styles.opt} />
    );
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => catalogDispatchers.catalogEdit()}> 添加菜单 </Button>
          </div>
          <DataTableTemple
            visibleLoading={catalogState.catalogLoadingVisible}
            dataSource={catalogState.catalogTableData}
            items={catalogState.catalogTable}
            total={catalogState.catalogTotal}
            getPage={(catalogCurrent) => catalogDispatchers.catalogPage({
              catalogCurrent,
              catalogTable: catalogState.catalogTable,
              catalogForm: catalogState.catalogForm,
            })}
            rowSelection={{
              mode: 'single',
              onSelect: (selected, record) => {
                dictionaryDispatchers.onRowClick({ selected, record });
              },
            }}
            operationRender={catalogOperationRender}
            pageRender={catalogPageRender}
          />
        </div>
      </Cell>
      <DataFormTemple
        title="菜单"
        visibleDialog={catalogState.catalogVisible}
        onClose={() => catalogDispatchers.setState({ catalogVisible: false })}
        items={catalogState.catalogFormItem}
        dispatchers={(value) => catalogDispatchers.setDataForm(value)}
        onOk={() => catalogDispatchers.catalogSave({
          catalogFormData: catalogState.catalogFormData,
          catalogCurrent: catalogState.catalogCurrent,
          catalogTable: catalogState.catalogTable,
          catalogForm: catalogState.catalogForm,
        })}
        formDataValue={catalogState.catalogFormData}
      />
      <CustomCatalog
        catalogState={catalogState}
        catalogDispatchers={catalogDispatchers}
      />
    </ResponsiveGrid>
  );
}

export default Catalog;
