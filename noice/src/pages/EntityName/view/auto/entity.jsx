/* eslint-disable no-unused-vars */
import { Button, Dialog } from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/EntityName/index.module.scss';

function Entity() {
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

  const entityRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => entityDispatchers.entityEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>);
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => entityDispatchers.entityDelete({
        record,
        entityCurrent: entityState.entityCurrent,
        entityTable: entityState.entityTable,
        pid: entityState.entityNameId,
      }),
    });
  };

  return (
    <div>
      <Dialog
        visible={entityState.divVisible}
        footer={false}
        onClose={() => entityDispatchers.setState({
          divVisible: false,
          entityNameId: '',
        })}
        style={{ width: '90%' }}
      >
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => entityDispatchers.entityEdit()}> 添加 </Button>
          </div>
          <DataTableTemple
            visibleLoading={entityState.entityLoadingVisible}
            dataSource={entityState.entityTableData}
            items={entityState.entityTable}
            total={entityState.entityTotal}
            primaryKey="id"
            getPage={(entityCurrent) => entityDispatchers.entityPage({ entityCurrent, pid: entityState.entityNameId })}
            pageRender={entityRender}
          />
        </div>
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={entityState.entityVisible}
        onClose={() => entityDispatchers.setState({ entityVisible: false })}
        items={entityState.entityForm}
        dispatchers={(value) => entityDispatchers.setDataForm(value)}
        onOk={() => entityDispatchers.entitySave({
          pid: entityState.entityNameId,
          entityFormData: entityState.entityFormData,
          entityCurrent: entityState.entityCurrent,
        })}
        formDataValue={entityState.entityFormData}
      />
    </div>
  );
}

export default Entity;
