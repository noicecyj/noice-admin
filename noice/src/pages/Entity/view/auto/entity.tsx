import React, {useEffect} from 'react';
import pageStore from '@/pages/Entity/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnEntity} from '@/pages/Entity/view/custom/entity';

function Entity() {
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

  const propertyDispatchers = pageStore.useModelDispatchers('property');

  const [customEntityState, customEntityDispatchers] = pageStore.useModel('customEntity');

  useEffect(() => {
    entityDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [entityDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => entityDispatchers.entityAdd()}
        editItem={record => entityDispatchers.entityEdit(record)}
        deleteItem={record => entityDispatchers.entityDelete({
          record,
          pageNumber: entityState.entityCurrent,
        })}
        visibleLoading={entityState.entityLoadingVisible}
        dataSource={entityState.entityTableData}
        items={entityState.entityTable}
        total={entityState.entityTotal}
        getPage={entityCurrent => entityDispatchers.entityPage(entityCurrent)}
        primaryKey="id"
        customData={entityState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnEntity value={value} index={index} record={record}/>
          );
        }}
        son1="属性"
        sonMethod1={record => propertyDispatchers.onRowClick(record)}
        customMethod1={() => customEntityDispatchers.customMethod1()}
        customMethod2={() => customEntityDispatchers.customMethod2()}
        customMethod3={() => customEntityDispatchers.customMethod3()}
        customMethodName1={customEntityState.customMethodName1}
        customMethodName2={customEntityState.customMethodName2}
        customMethodName3={customEntityState.customMethodName3}
      />
      <DataFormTemple
        customData={entityState.customData}
        title={entityState.entityTitle}
        visibleDialog={entityState.entityVisible}
        onClose={() => entityDispatchers.setState({entityVisible: false})}
        items={[...entityState.entityForm, ...customEntityState.customFrom]}
        dispatchers={value => entityDispatchers.setDataForm(value)}
        onOk={() => entityDispatchers.entitySave({
          entityFormData: entityState.entityFormData,
          pageNumber: entityState.entityCurrent,
        })}
        formDataValue={entityState.entityFormData}
        formSortCode={String(Number.parseInt(String(entityState.entityTotal)) + 10)}
      />
    </>
  );
}

export default Entity;
