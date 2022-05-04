import React, {useEffect} from 'react';
import pageStore from '@/pages/FlowGroup/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnFlowGroup} from '@/pages/FlowGroup/view/custom/flowGroup';

function FlowGroup() {
  const [flowGroupState, flowGroupDispatchers] = pageStore.useModel('flowGroup');

  const [customFlowGroupState, customFlowGroupDispatchers] = pageStore.useModel('customFlowGroup');

  useEffect(() => {
    flowGroupDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [flowGroupDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => flowGroupDispatchers.flowGroupAdd()}
        editItem={record => flowGroupDispatchers.flowGroupEdit(record)}
        deleteItem={record => flowGroupDispatchers.flowGroupDelete({
          record,
          data: {
            pageNumber: flowGroupState.flowGroupCurrent,
          },
        })}
        visibleLoading={flowGroupState.flowGroupLoadingVisible}
        dataSource={flowGroupState.flowGroupTableData}
        items={flowGroupState.flowGroupTable}
        total={flowGroupState.flowGroupTotal}
        getPage={flowGroupCurrent => flowGroupDispatchers.flowGroupPage(flowGroupCurrent)}
        primaryKey="id"
        customData={flowGroupState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnFlowGroup value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customFlowGroupDispatchers.customMethod1()}
        customMethod2={() => customFlowGroupDispatchers.customMethod2()}
        customMethod3={() => customFlowGroupDispatchers.customMethod3()}
        customMethodName1={customFlowGroupState.customMethodName1}
        customMethodName2={customFlowGroupState.customMethodName2}
        customMethodName3={customFlowGroupState.customMethodName3}
      />
      <DataFormTemple
        customData={flowGroupState.customData}
        title={flowGroupState.flowGroupTitle}
        visibleDialog={flowGroupState.flowGroupVisible}
        onClose={() => flowGroupDispatchers.setState({flowGroupVisible: false})}
        items={[...flowGroupState.flowGroupForm, ...customFlowGroupState.customFrom]}
        dispatchers={value => flowGroupDispatchers.setDataForm(value)}
        onOk={() => flowGroupDispatchers.flowGroupSave({
          flowGroupFormData: flowGroupState.flowGroupFormData,
          pageNumber: flowGroupState.flowGroupCurrent,
        })}
        formDataValue={flowGroupState.flowGroupFormData}
      />
    </>
  );
}

export default FlowGroup;
