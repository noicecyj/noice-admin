import { Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/Catalog/index.module.scss';
import CatalogCustom from '@/pages/Catalog/view/custom/catalog';

function Catalog() {
  const [catalogState, catalogDispatchers] = pageStore.useModel('catalog');
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

  useEffect(() => {
    catalogDispatchers.findDataTableAndFormByName();
  }, [catalogDispatchers]);

  const catalogRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => catalogDispatchers.catalogEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const catalogCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <CatalogCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => catalogDispatchers.catalogDelete({
        record,
        data: {
          pageNumber: catalogState.catalogCurrent,
        },
      }),
    });
  };

  return (
    <>
      <DataTableTemple
        edit={() => catalogDispatchers.catalogEdit()}
        visibleLoading={catalogState.catalogLoadingVisible}
        dataSource={catalogState.catalogTableData}
        items={catalogState.catalogTable}
        total={catalogState.catalogTotal}
        getPage={(catalogCurrent) => catalogDispatchers.catalogPage({
          pageNumber: catalogCurrent,
        })}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            catalogDispatchers.setState({ catalogId: record.id });
            dictionaryDispatchers.onRowClick({ selected, record });
          },
          selectedRowKeys: [
            dictionaryState.catalogId,
          ],
        }}
        primaryKey="id"
        pageRender={catalogRender}
        operationRender={catalogState.customType ? catalogCustomRender : null}
      />
      <DataFormTemple
        title={catalogState.catalogTitle}
        visibleDialog={catalogState.catalogVisible}
        onClose={() => catalogDispatchers.setState({ catalogVisible: false })}
        items={catalogState.catalogForm}
        dispatchers={(value) => catalogDispatchers.setDataForm(value)}
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
