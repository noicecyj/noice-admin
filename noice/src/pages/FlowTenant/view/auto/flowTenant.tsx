import React, {useEffect} from 'react';
import pageStore from '@/pages/FlowTenant/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnFlowTenant} from '@/pages/FlowTenant/view/custom/flowTenant';

function FlowTenant() {
  const [flowTenantState, flowTenantDispatchers] = pageStore.useModel('flowTenant');

  const [customFlowTenantState, customFlowTenantDispatchers] = pageStore.useModel('customFlowTenant');

  useEffect(() => {
    flowTenantDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [flowTenantDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => flowTenantDispatchers.flowTenantAdd()}
        editItem={record => flowTenantDispatchers.flowTenantEdit(record)}
        deleteItem={record => flowTenantDispatchers.flowTenantDelete({
          record,
          data: {
            pageNumber: flowTenantState.flowTenantCurrent,
          },
        })}
        visibleLoading={flowTenantState.flowTenantLoadingVisible}
        dataSource={flowTenantState.flowTenantTableData}
        items={flowTenantState.flowTenantTable}
        total={flowTenantState.flowTenantTotal}
        getPage={flowTenantCurrent => flowTenantDispatchers.flowTenantPage(flowTenantCurrent)}
        primaryKey="id"
        customData={flowTenantState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnFlowTenant value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customFlowTenantDispatchers.customMethod1()}
        customMethod2={() => customFlowTenantDispatchers.customMethod2()}
        customMethod3={() => customFlowTenantDispatchers.customMethod3()}
        customMethodName1={customFlowTenantState.customMethodName1}
        customMethodName2={customFlowTenantState.customMethodName2}
        customMethodName3={customFlowTenantState.customMethodName3}
      />
      <DataFormTemple
        customData={flowTenantState.customData}
        title={flowTenantState.flowTenantTitle}
        visibleDialog={flowTenantState.flowTenantVisible}
        onClose={() => flowTenantDispatchers.setState({flowTenantVisible: false})}
        items={[...flowTenantState.flowTenantForm, ...customFlowTenantState.customFrom]}
        dispatchers={value => flowTenantDispatchers.setDataForm(value)}
        onOk={() => flowTenantDispatchers.flowTenantSave({
          flowTenantFormData: flowTenantState.flowTenantFormData,
          pageNumber: flowTenantState.flowTenantCurrent,
        })}
        formDataValue={flowTenantState.flowTenantFormData}
        formSortCode={String(Number.parseInt(String(flowTenantState.flowTenantTotal)) + 10)}
      />
    </>
  );
}

export default FlowTenant;
