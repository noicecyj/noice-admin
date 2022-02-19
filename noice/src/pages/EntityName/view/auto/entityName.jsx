import { Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/EntityName/index.module.scss';
import EntityNameCustom from '@/pages/EntityName/view/custom/entityName';

function EntityName() {
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

  useEffect(() => {
    entityNameDispatchers.findDataTableAndFormByName();
  }, [entityNameDispatchers]);

  const entityNameRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => entityNameDispatchers.entityNameEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const entityNameCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <EntityNameCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => entityNameDispatchers.entityNameDelete({
        record,
        data: {
          pageNumber: entityNameState.entityNameCurrent,
        },
      }),
    });
  };

  return (
    <>
      <DataTableTemple
        edit={() => entityNameDispatchers.entityNameEdit()}
        visibleLoading={entityNameState.entityNameLoadingVisible}
        dataSource={entityNameState.entityNameTableData}
        items={entityNameState.entityNameTable}
        total={entityNameState.entityNameTotal}
        getPage={(entityNameCurrent) => entityNameDispatchers.entityNamePage({
          pageNumber: entityNameCurrent,
        })}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            entityNameDispatchers.setState({ entityNameId: record.id });
            entityDispatchers.onRowClick({ selected, record });
          },
          selectedRowKeys: [
            entityState.entityNameId,
          ],
        }}
        primaryKey="id"
        pageRender={entityNameRender}
        operationRender={entityNameState.customType ? entityNameCustomRender : null}
      />
      <DataFormTemple
        title={entityNameState.entityNameTitle}
        visibleDialog={entityNameState.entityNameVisible}
        onClose={() => entityNameDispatchers.setState({ entityNameVisible: false })}
        items={entityNameState.entityNameForm}
        dispatchers={(value) => entityNameDispatchers.setDataForm(value)}
        onOk={() => entityNameDispatchers.entityNameSave({
          entityNameFormData: entityNameState.entityNameFormData,
          pageNumber: entityNameState.entityNameCurrent,
        })}
        formDataValue={entityNameState.entityNameFormData}
      />
    </>
  );
}

export default EntityName;
