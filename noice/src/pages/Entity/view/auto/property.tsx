import {Dialog} from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/Entity/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnProperty} from '@/pages/Entity/view/custom/property';

function Property() {
  const [propertyState, propertyDispatchers] = pageStore.useModel('property');

  const [customPropertyState, customPropertyDispatchers] = pageStore.useModel('customProperty');

  return (
    <Dialog
      v2
      visible={propertyState.divVisible}
      footer={false}
      onClose={() => propertyDispatchers.setState({
        divVisible: false,
        entity: {},
      })}
      style={{width: '100%'}}
    >
      <DataTableTemple
        createItem={() => propertyDispatchers.propertyAdd()}
        editItem={record => propertyDispatchers.propertyEdit(record)}
        deleteItem={record => propertyDispatchers.propertyDelete({
          record,
          pageNumber: propertyState.propertyCurrent,
          entity: propertyState.entity,
        })}
        visibleLoading={propertyState.propertyLoadingVisible}
        dataSource={propertyState.propertyTableData}
        items={propertyState.propertyTable}
        total={propertyState.propertyTotal}
        primaryKey="id"
        getPage={propertyCurrent => propertyDispatchers.propertyPage({
          propertyCurrent,
          entity: propertyState.entity,
        })}
        customData={propertyState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnProperty value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customPropertyDispatchers.customMethod1()}
        customMethod2={() => customPropertyDispatchers.customMethod2()}
        customMethod3={() => customPropertyDispatchers.customMethod3()}
        customMethodName1={customPropertyState.customMethodName1}
        customMethodName2={customPropertyState.customMethodName2}
        customMethodName3={customPropertyState.customMethodName3}
      />
      <DataFormTemple
        customData={propertyState.customData}
        title={propertyState.propertyTitle}
        visibleDialog={propertyState.propertyVisible}
        onClose={() => propertyDispatchers.setState({propertyVisible: false})}
        items={[...propertyState.propertyForm, ...customPropertyState.customFrom]}
        dispatchers={value => propertyDispatchers.setDataForm(value)}
        onOk={() => propertyDispatchers.propertySave({
          propertyFormData: propertyState.propertyFormData,
          pageNumber: propertyState.propertyCurrent,
          entity: propertyState.entity,
        })}
        formDataValue={propertyState.propertyFormData}
        formSortCode={String(Number.parseInt(String(propertyState.propertyTotal)) + 10)}
      />
    </Dialog>
  );
}

export default Property;
