import React, {useEffect} from 'react';
import pageStore from '@/pages/Role/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnRole} from '@/pages/Role/view/custom/role';

function Role() {
  const [roleState, roleDispatchers] = pageStore.useModel('role');

  const [userState, userDispatchers] = pageStore.useModel('user');

  const [authorityState, authorityDispatchers] = pageStore.useModelDispatchers('authority');

  const [customRoleState, customRoleDispatchers] = pageStore.useModel('customRole');

  useEffect(() => {
    roleDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [roleDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => roleDispatchers.roleAdd()}
        editItem={record => roleDispatchers.roleEdit(record)}
        deleteItem={record => roleDispatchers.roleDelete(roleState.roleCurrent, record)}
        visibleLoading={roleState.roleLoadingVisible}
        dataSource={roleState.roleTableData}
        items={roleState.roleTable}
        total={roleState.roleTotal}
        getPage={roleCurrent => roleDispatchers.rolePage(roleCurrent)}
        primaryKey="id"
        customData={roleState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnRole value={value} index={index} record={record}/>
          );
        }}
        manyToMany1="用户"
        manyToManyMethod1={record => userDispatchers.onManyToManyRowClick(record)}
        manyToMany2="权限"
        manyToManyMethod2={record => authorityDispatchers.onManyToManyRowClick(record)}
        customMethod1={() => customRoleDispatchers.customMethod1()}
        customMethod2={() => customRoleDispatchers.customMethod2()}
        customMethod3={() => customRoleDispatchers.customMethod3()}
        customMethodName1={customRoleState.customMethodName1}
        customMethodName2={customRoleState.customMethodName2}
        customMethodName3={customRoleState.customMethodName3}
      />
      <DataFormTemple
        customData={roleState.customData}
        title={roleState.roleTitle}
        visibleDialog={roleState.roleVisible}
        onClose={() => roleDispatchers.setState({roleVisible: false})}
        items={[...roleState.roleForm, ...customRoleState.customFrom]}
        dispatchers={value => roleDispatchers.setDataForm(value)}
        onOk={() => roleDispatchers.roleSave(roleState.roleCurrent, roleState.roleFormData)}
        formDataValue={roleState.roleFormData}
        formSortCode={String(Number.parseInt(String(roleState.roleTotal)) + 10)}
      />
    </>
  );
}

export default Role;
