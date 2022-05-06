import React from 'react';
import {Box, Button, Dialog} from "@alifd/next";
import pageStore from '@/pages/User/store';
import DataTableTemple from "@/components/dataTable";
import DataFormTemple from "@/components/dataForm";

function CustomColumnUser(props) {
  const {record} = props;
  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');
  const [roleState, roleDispatchers] = pageStore.useModel('role');
  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const customData = {customType: false, formCol: 2};

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.setState({
            dialogPasswordVisible: true,
            recordId: record.id,
          })}
        > 重置密码 </Button>
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.openUserRoleDialog({userId: record.id})}
        > 角色分配 </Button>
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.openUserAuthorityDialog({userId: record.id})}
        > 权限分配 </Button>
      </Box>
      <DataFormTemple
        title='重置密码'
        visibleDialog={customUserState.dialogPasswordVisible}
        onClose={() => customUserDispatchers.setState({dialogPasswordVisible: false})}
        items={customUserState.passwordForm}
        dispatchers={(value) => customUserDispatchers.setDataForm(value)}
        onOk={() => customUserDispatchers.resetPassword({
          ...customUserState.passwordFormData,
          userId: customUserState.recordId,
        })}
        formDataValue={customUserState.passwordFormData}
        customData={customData}
      />
      <Dialog
        v2
        title="角色分配"
        visible={customUserState.dialogRoleVisible}
        onClose={() => customUserDispatchers.setState({
          dialogRoleVisible: false,
          recordId: '',
        })}
        onOk={() => customUserDispatchers.okUserRoleDialog({
          userId: customUserState.recordId,
          roleIds: customUserState.selectRoles,
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
              customUserDispatchers.setState({
                selectRoles: ids,
              })
            },
            selectedRowKeys: customUserState.selectRoles,
          }}
          customData={customData}
        />
      </Dialog>
      <Dialog
        v2
        title="权限分配"
        visible={customUserState.dialogAuthorityVisible}
        onClose={() => customUserDispatchers.setState({
          dialogAuthorityVisible: false,
          recordId: '',
        })}
        onOk={() => customUserDispatchers.okUserAuthorityDialog({
          userId: customUserState.recordId,
          authorityIds: customUserState.selectAuthorities,
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
              customUserDispatchers.setState({
                selectAuthorities: ids,
              })
            },
            selectedRowKeys: customUserState.selectAuthorities,
          }}
          customData={customData}
        />
      </Dialog>
    </>
  );
}

export {CustomColumnUser};
