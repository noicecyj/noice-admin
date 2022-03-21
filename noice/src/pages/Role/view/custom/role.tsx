import React from 'react';
import pageStore from '@/pages/Role/store';
import {Box, Button, Dialog} from "@alifd/next";
import DataTableTemple from "@/components/dataTable";


function CustomColumnRole(props) {
  const {record} = props;
  const [customRoleState, customRoleDispatchers] = pageStore.useModel('customRole');
  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customRoleDispatchers.openRoleAuthorityDialog({roleId: record.id})}
        > 权限分配 </Button>
      </Box>
      <Dialog
        v2
        title="权限分配"
        visible={customRoleState.dialogAuthorityVisible}
        onClose={() => customRoleDispatchers.setState({
          dialogAuthorityVisible: false,
          recordId: '',
        })}
        onOk={() => customRoleDispatchers.okRoleAuthorityDialog({
          roleId: customRoleState.recordId,
          authorityIds: customRoleState.selectAuthorities,
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
              customRoleDispatchers.setState({
                selectAuthorities: ids,
              })
            },
            selectedRowKeys: customRoleState.selectAuthorities,
          }}
        />
      </Dialog>
    </>
  );
}

export {CustomColumnRole};
