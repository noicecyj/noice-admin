import { Button, Dialog, ResponsiveGrid } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/Catalog/index.module.scss';
import CatalogCustom from '@/pages/Catalog/view/custom/catalog';

const { Cell } = ResponsiveGrid;

function Catalog() {
  const [catalogState, catalogDispatchers] = pageStore.useModel('catalog');
  const dictionaryDispatchers = pageStore.useModelDispatchers('dictionary');

  useEffect(() => {
    catalogDispatchers.findDataTableAndFormByName();
  }, [catalogDispatchers]);

  const catalogRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => catalogDispatchers.catalogEdit(record)}> 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning> 删除 </Button>
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
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => catalogDispatchers.catalogEdit()}> 添加 </Button>
          </div>
          <DataTableTemple
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
              selectedRowKeys: [catalogState.catalogId],
            }}
            primaryKey="id"
            pageRender={catalogRender}
            operationRender={catalogState.customType ? catalogCustomRender : null}
          />
        </div>
      </Cell>
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
    </ResponsiveGrid>
  );
}

export default Catalog;
