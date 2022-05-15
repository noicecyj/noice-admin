import React, {useEffect} from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnEntityName} from '@/pages/EntityName/view/custom/entityName';

function EntityName() {
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');
  const [entityState, entityDispatchers] = pageStore.useModel('entity');

  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');

  useEffect(() => {
    entityNameDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [entityNameDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => entityNameDispatchers.entityNameAdd()}
        editItem={record => entityNameDispatchers.entityNameEdit(record)}
        deleteItem={record => entityNameDispatchers.entityNameDelete({
          record,
          data: {
            pageNumber: entityNameState.entityNameCurrent,
          },
        })}
        visibleLoading={entityNameState.entityNameLoadingVisible}
        dataSource={entityNameState.entityNameTableData}
        items={entityNameState.entityNameTable}
        total={entityNameState.entityNameTotal}
        getPage={entityNameCurrent => entityNameDispatchers.entityNamePage(entityNameCurrent)}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            entityNameDispatchers.setState({entityNameId: record.id});
            entityDispatchers.onRowClick({selected, record});
          },
          selectedRowKeys: [
            entityState.entityNameId,
          ],
        }}
        primaryKey="id"
        customData={entityNameState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnEntityName value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customEntityNameDispatchers.customMethod1()}
        customMethod2={() => customEntityNameDispatchers.customMethod2()}
        customMethod3={() => customEntityNameDispatchers.customMethod3()}
        customMethodName1={customEntityNameState.customMethodName1}
        customMethodName2={customEntityNameState.customMethodName2}
        customMethodName3={customEntityNameState.customMethodName3}
      />
      <DataFormTemple
        customData={entityNameState.customData}
        title={entityNameState.entityNameTitle}
        visibleDialog={entityNameState.entityNameVisible}
        onClose={() => entityNameDispatchers.setState({entityNameVisible: false})}
        items={[...entityNameState.entityNameForm, ...customEntityNameState.customFrom]}
        dispatchers={value => entityNameDispatchers.setDataForm(value)}
        onOk={() => entityNameDispatchers.entityNameSave({
          entityNameFormData: entityNameState.entityNameFormData,
          pageNumber: entityNameState.entityNameCurrent,
        })}
        formDataValue={entityNameState.entityNameFormData}
        formSortCode={String(Number.parseInt(String(entityNameState.entityNameTotal)) + 10)}
      />
    </>
  );
}

export default EntityName;
