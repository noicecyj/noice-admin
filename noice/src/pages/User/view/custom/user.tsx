import React from 'react';
import {Box, Button, Dialog} from "@alifd/next";
import pageStore from '@/pages/User/store';
import DataTableTemple from "@/components/dataTable";

// const formItemLayout = {
//   labelCol: {
//     fixedSpan: 6,
//   },
//   wrapperCol: {
//     span: 40,
//   },
// };

function CustomColumnUser(props) {
  const {record} = props;
  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');
  const [roleState, roleDispatchers] = pageStore.useModel('role');

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.openDialog({userId: record.id})}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 角色分配 </Button>
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.openDialog({userId: record.id})}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 权限分配 </Button>
      </Box>
      <Dialog
        v2
        title="角色分配"
        visible={customUserState.dialogVisible}
        onClose={() => customUserDispatchers.setState({
          dialogVisible: false,
          recordId: '',
        })}
        onOk={() => customUserDispatchers.okDialog({
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
        />
      </Dialog>

    </>
  );
}

export {CustomColumnUser};
