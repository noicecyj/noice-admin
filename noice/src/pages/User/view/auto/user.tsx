import React, {useEffect} from 'react';
import pageStore from '@/pages/User/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnUser} from '@/pages/User/view/custom/user';

function User() {
  const [userState, userDispatchers] = pageStore.useModel('user');

  const [roleState, roleDispatchers] = pageStore.useModel('role');

  const [authorityState, authorityDispatchers] = pageStore.useModelDispatchers('authority');

  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');

  useEffect(() => {
    userDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [userDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => userDispatchers.userAdd()}
        editItem={record => userDispatchers.userEdit(record)}
        deleteItem={record => userDispatchers.userDelete(userState.userCurrent, record)}
        visibleLoading={userState.userLoadingVisible}
        dataSource={userState.userTableData}
        items={userState.userTable}
        total={userState.userTotal}
        getPage={userCurrent => userDispatchers.userPage(userCurrent)}
        primaryKey="id"
        customData={userState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnUser value={value} index={index} record={record}/>
          );
        }}
        manyToMany1="角色"
        manyToManyMethod1={record => roleDispatchers.onManyToManyRowClick(record)}
        manyToMany2="权限"
        manyToManyMethod2={record => authorityDispatchers.onManyToManyRowClick(record)}
        customMethod1={() => customUserDispatchers.customMethod1()}
        customMethod2={() => customUserDispatchers.customMethod2()}
        customMethod3={() => customUserDispatchers.customMethod3()}
        customMethodName1={customUserState.customMethodName1}
        customMethodName2={customUserState.customMethodName2}
        customMethodName3={customUserState.customMethodName3}
      />
      <DataFormTemple
        customData={userState.customData}
        title={userState.userTitle}
        visibleDialog={userState.userVisible}
        onClose={() => userDispatchers.setState({userVisible: false})}
        items={[...userState.userForm, ...customUserState.customFrom]}
        dispatchers={value => userDispatchers.setDataForm(value)}
        onOk={() => userDispatchers.userSave(userState.userCurrent, userState.userFormData)}
        formDataValue={userState.userFormData}
        formSortCode={String(Number.parseInt(String(userState.userTotal)) + 10)}
      />
    </>
  );
}

export default User;
