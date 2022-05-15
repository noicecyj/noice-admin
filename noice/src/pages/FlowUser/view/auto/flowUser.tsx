import React, {useEffect} from 'react';
import pageStore from '@/pages/FlowUser/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnFlowUser} from '@/pages/FlowUser/view/custom/flowUser';

function FlowUser() {
  const [flowUserState, flowUserDispatchers] = pageStore.useModel('flowUser');

  const [customFlowUserState, customFlowUserDispatchers] = pageStore.useModel('customFlowUser');

  useEffect(() => {
    flowUserDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [flowUserDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => flowUserDispatchers.flowUserAdd()}
        editItem={record => flowUserDispatchers.flowUserEdit(record)}
        deleteItem={record => flowUserDispatchers.flowUserDelete({
          record,
          data: {
            pageNumber: flowUserState.flowUserCurrent,
          },
        })}
        visibleLoading={flowUserState.flowUserLoadingVisible}
        dataSource={flowUserState.flowUserTableData}
        items={flowUserState.flowUserTable}
        total={flowUserState.flowUserTotal}
        getPage={flowUserCurrent => flowUserDispatchers.flowUserPage(flowUserCurrent)}
        primaryKey="id"
        customData={flowUserState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnFlowUser value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customFlowUserDispatchers.customMethod1()}
        customMethod2={() => customFlowUserDispatchers.customMethod2()}
        customMethod3={() => customFlowUserDispatchers.customMethod3()}
        customMethodName1={customFlowUserState.customMethodName1}
        customMethodName2={customFlowUserState.customMethodName2}
        customMethodName3={customFlowUserState.customMethodName3}
      />
      <DataFormTemple
        customData={flowUserState.customData}
        title={flowUserState.flowUserTitle}
        visibleDialog={flowUserState.flowUserVisible}
        onClose={() => flowUserDispatchers.setState({flowUserVisible: false})}
        items={[...flowUserState.flowUserForm, ...customFlowUserState.customFrom]}
        dispatchers={value => flowUserDispatchers.setDataForm(value)}
        onOk={() => flowUserDispatchers.flowUserSave({
          flowUserFormData: flowUserState.flowUserFormData,
          pageNumber: flowUserState.flowUserCurrent,
        })}
        formDataValue={flowUserState.flowUserFormData}
        formSortCode={String(Number.parseInt(String(flowUserState.flowUserTotal)) + 10)}
      />
    </>
  );
}

export default FlowUser;
