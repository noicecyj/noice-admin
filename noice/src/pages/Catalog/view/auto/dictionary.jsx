import { Button, Dialog } from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/Catalog/index.module.scss';
import DictionaryCustom from '@/pages/Catalog/view/custom/dictionary';

function Dictionary() {
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

  const dictionaryRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => dictionaryDispatchers.dictionaryEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const dictionaryCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <DictionaryCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => dictionaryDispatchers.dictionaryDelete({
        record,
        data: {
          pageNumber: dictionaryState.dictionaryCurrent,
          pid: dictionaryState.dictionaryNameId,
        },
      }),
    });
  };

  return (
    <div>
      <Dialog
        visible={dictionaryState.divVisible}
        footer={false}
        onClose={() => dictionaryDispatchers.setState({
          divVisible: false,
          catalogId: '',
        })}
        style={{ width: '90%' }}
      >
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => dictionaryDispatchers.dictionaryEdit()}> 添加 </Button>
          </div>
          <DataTableTemple
            visibleLoading={dictionaryState.dictionaryLoadingVisible}
            dataSource={dictionaryState.dictionaryTableData}
            items={dictionaryState.dictionaryTable}
            total={dictionaryState.dictionaryTotal}
            primaryKey="id"
            getPage={(dictionaryCurrent) => dictionaryDispatchers.dictionaryPage({ dictionaryCurrent, pid: dictionaryState.dictionaryNameId })}
            pageRender={dictionaryRender}
            operationRender={dictionaryCustomRender}
          />
        </div>
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={dictionaryState.dictionaryVisible}
        onClose={() => dictionaryDispatchers.setState({ dictionaryVisible: false })}
        items={dictionaryState.dictionaryForm}
        dispatchers={(value) => dictionaryDispatchers.setDataForm(value)}
        onOk={() => dictionaryDispatchers.dictionarySave({
          dictionaryFormData: dictionaryState.dictionaryFormData,
          pageNumber: dictionaryState.dictionaryCurrent,
          pid: dictionaryState.catalogId,
        })}
        formDataValue={dictionaryState.dictionaryFormData}
      />
    </div>
  );
}

export default Dictionary;
