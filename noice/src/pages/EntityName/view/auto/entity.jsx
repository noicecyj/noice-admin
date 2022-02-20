import { Dialog } from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnEntity } from '@/pages/EntityName/view/custom/entity';

function Entity() {
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

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
        <DataTableTemple
          createItem={() => entityDispatchers.entityEdit()}
          editItem={(record) => entityDispatchers.entityEdit(record)}
          deleteItem={(record) => entityDispatchers.entityDelete({
            record,
            data: {
              pageNumber: entityState.entityCurrent,
            },
          })}
          visibleLoading={entityState.entityLoadingVisible}
          dataSource={entityState.entityTableData}
          items={entityState.entityTable}
          total={entityState.entityTotal}
          primaryKey="id"
          getPage={(entityCurrent) => entityDispatchers.entityPage({ entityCurrent, pid: entityState.entityNameId })}
          columnRender={entityState.customType ? (value, index, record) => {
            return (
              <CustomColumnEntity value={value} index={index} record={record} />
            );
          } : null}
        />
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={entityState.entityVisible}
        onClose={() => entityDispatchers.setState({ entityVisible: false })}
        items={entityState.entityForm}
        dispatchers={(value) => entityDispatchers.setDataForm(value)}
        onOk={() => entityDispatchers.entitySave({
          entityFormData: entityState.entityFormData,
          pageNumber: entityState.entityCurrent,
          pid: entityState.entityNameId,
        })}
        formDataValue={entityState.entityFormData}
      />
    </div>
  );
}

export default Entity;
