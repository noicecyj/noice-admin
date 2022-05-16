import React, {useEffect} from 'react';
import pageStore from '@/pages/User/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnUser} from '@/pages/User/view/custom/user';
import {Dialog} from "@alifd/next";

function User() {
  const [userState, userDispatchers] = pageStore.useModel('user');
  const [roleState, roleDispatchers] = pageStore.useModel('role');
  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');

  useEffect(() => {
    userDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [userDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => userDispatchers.userAdd()}
        editItem={record => userDispatchers.userEdit(record)}
        deleteItem={record => userDispatchers.userDelete({
          record,
          data: {
            pageNumber: userState.userCurrent,
          },
        })}
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
        onOk={() => userDispatchers.userSave({
          userFormData: userState.userFormData,
          pageNumber: userState.userCurrent,
        })}
        formDataValue={userState.userFormData}
        formSortCode={String(Number.parseInt(String(userState.userTotal)) + 10)}
      />
      <Dialog
        v2
        title="角色分配"
        visible={roleState.dialogUserRoleVisible}
        onClose={() => roleDispatchers.setState({
          dialogUserRoleVisible: false,
          userId: '',
        })}
        onOk={() => roleDispatchers.okUserRoleDialog({
          userId: roleState.userId,
          roleIds: roleState.selectUserRoles,
        })}
        style={{width: '90%'}}
      >
        <DataTableTemple
          visibleLoading={roleState.roleLoadingVisible}
          dataSource={roleState.roleTableData}
          items={roleState.roleTable}
          total={roleState.roleTotal}
          getPage={(roleCurrent) => roleDispatchers.rolePage(roleCurrent)}
          primaryKey="id"
          rowSelection={{
            onChange: (ids, records) => {
              console.log(ids, records)
              roleDispatchers.setState({
                selectUserRoles: ids,
              })
            },
            selectedRowKeys: roleState.selectUserRoles,
          }}
        />
      </Dialog>
      <Dialog
        v2
        title="权限分配"
        visible={authorityState.dialogUserAuthorityVisible}
        onClose={() => authorityDispatchers.setState({
          dialogUserAuthorityVisible: false,
          userId: '',
        })}
        onOk={() => authorityDispatchers.okUserAuthorityDialog({
          userId: authorityState.userId,
          authorityIds: authorityState.selectUserAuthorities,
        })}
        style={{width: '90%'}}
      >
        <DataTableTemple
          visibleLoading={authorityState.authorityLoadingVisible}
          dataSource={authorityState.authorityTableData}
          items={authorityState.authorityTable}
          total={authorityState.authorityTotal}
          getPage={(authorityCurrent) => authorityDispatchers.authorityPage(authorityCurrent)}
          primaryKey="id"
          rowSelection={{
            onChange: (ids, records) => {
              console.log(ids, records)
              authorityDispatchers.setState({
                selectUserAuthorities: ids,
              })
            },
            selectedRowKeys: authorityState.selectUserAuthorities,
          }}
        />
      </Dialog>
    </>
  );
}

export default User;
