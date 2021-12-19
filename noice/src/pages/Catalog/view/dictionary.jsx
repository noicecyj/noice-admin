/* eslint-disable no-unused-vars */
import { Button, Dialog } from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import CustomDictionary from '@/pages/Catalog/view/custom/dictionary';
import styles from './index.module.scss';

function Dictionary() {
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');
  const [customDictionaryState, customDictionaryDispatchers] = pageStore.useModel('customDictionary');

  const dictionaryPageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => dictionaryDispatchers.dictionaryEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => dictionaryDispatchers.dictionaryDelete({
        record,
        dictionaryCurrent: dictionaryState.dictionaryCurrent,
        dictionaryTable: dictionaryState.dictionaryTable,
        dictionaryForm: dictionaryState.dictionaryForm,
        catalogId: dictionaryState.catalogId,
      }),
    });
  };

  const dictionaryOperationRender = (value, index, record) => {
    return (
      <div className={styles.opt} />
    );
  };

  return (
    <div>
      <Dialog
        visible={dictionaryState.divVisible}
        footer={false}
        onClose={() => dictionaryDispatchers.setState({ divVisible: false })}
        style={{ width: '90%' }}
      >
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => dictionaryDispatchers.dictionaryEdit()}> 添加菜单 </Button>
          </div>
          <DataTableTemple
            visibleLoading={dictionaryState.dictionaryLoadingVisible}
            dataSource={dictionaryState.dictionaryTableData}
            items={dictionaryState.dictionaryTable}
            total={dictionaryState.dictionaryTotal}
            getPage={(dictionaryCurrent) => dictionaryDispatchers.dictionaryPage({
              dictionaryCurrent,
              dictionaryTable: dictionaryState.dictionaryTable,
              dictionaryForm: dictionaryState.dictionaryForm,
              catalogId: dictionaryState.catalogId,
            })}
            operationRender={dictionaryOperationRender}
            pageRender={dictionaryPageRender}
          />
        </div>
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={dictionaryState.dictionaryVisible}
        onClose={() => dictionaryDispatchers.setState({ dictionaryVisible: false })}
        items={dictionaryState.dictionaryFormItem}
        dispatchers={(value) => dictionaryDispatchers.setDataForm(value)}
        onOk={() => dictionaryDispatchers.dictionarySave({
          dictionaryFormData: dictionaryState.dictionaryFormData,
          dictionaryCurrent: dictionaryState.dictionaryCurrent,
          dictionaryTable: dictionaryState.dictionaryTable,
          dictionaryForm: dictionaryState.dictionaryForm,
          catalogId: dictionaryState.catalogId,
        })}
        formDataValue={dictionaryState.dictionaryFormData}
      />
      <CustomDictionary
        dictionaryState={dictionaryState}
        dictionaryDispatchers={dictionaryDispatchers}
      />
    </div>
  );
}

export default Dictionary;
