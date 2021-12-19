/* eslint-disable no-unused-vars */
import { Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import CustomEntity from '@/pages/EntityName/view/custom/entity';
import styles from '@/pages/EntityName/index.module.scss';

function Entity() {
  const [entityState, entityDispatchers] = pageStore.useModel('entity');
  const [customEntityState, customEntityDispatchers] = pageStore.useModel('customEntity');

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
        onClose={() => entityDispatchers.setState({ divVisible: false })}
        style={{ width: '90%' }}
      >
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => entityDispatchers.entityEdit()}> 添加菜单 </Button>
          </div>
          <DataTableTemple
            visibleLoading={entityState.entityLoadingVisible}
            dataSource={entityState.entityTableData}
            items={entityState.entityTable}
            total={entityState.entityTotal}
            getPage={(entityCurrent) => entityDispatchers.entityPage(entityCurrent, entityState.entityNameId)}
            pageRender={entityRender}
          />
        </div>
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={entityState.entityVisible}
        onClose={() => entityDispatchers.setState({ entityVisible: false })}
        items={entityState.entityFormItem}
        dispatchers={(value) => entityDispatchers.setDataForm(value)}
        onOk={() => entityDispatchers.entitySave({
          entityFormData: entityState.entityFormData,
          entityCurrent: entityState.entityCurrent,
        })}
        formDataValue={entityState.entityFormData}
      />
      {/* <CustomEntity
        entityState={entityState}
        entityDispatchers={entityDispatchers}
      /> */}
    </div>
  );
}

export default Entity;
