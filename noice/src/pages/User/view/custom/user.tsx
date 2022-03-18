import React from 'react';
import {Button, Dialog} from "@alifd/next";
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
      {
        <Button
          type="normal"
          size="small"
          onClick={() => customUserDispatchers.openDialog({id: record.id})}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 角色分配 </Button>
      }
      <Dialog
        visible={customUserState.dialogVisible}
        footer={false}
        onClose={() => customUserDispatchers.setState({
          dialogVisible: false,
          recordId: '',
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
        />
      </Dialog>

    </>
  );
}

export {CustomColumnUser};
