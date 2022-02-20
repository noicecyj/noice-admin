import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnEntityName } from '@/pages/EntityName/view/custom/entityName';

function EntityName() {
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

  useEffect(() => {
    entityNameDispatchers.findDataTableAndFormByName();
  }, [entityNameDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => entityNameDispatchers.entityNameEdit()}
        editItem={(record) => entityNameDispatchers.entityNameEdit(record)}
        deleteItem={(record) => entityNameDispatchers.entityNameDelete({
          record,
          data: {
            pageNumber: entityNameState.entityNameCurrent,
          },
        })}
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
        columnRender={(value, index, record) => {
          return (
            <CustomColumnEntityName value={value} index={index} record={record} />
          );
        }}
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
