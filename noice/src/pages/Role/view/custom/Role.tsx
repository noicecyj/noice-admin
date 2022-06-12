import React from 'react';
// import pageStore from '@/pages/Role/store';
// import {Box, Button, Dialog} from "@alifd/next";
// import DataTableTemple from "@/components/dataTable";


function CustomColumn(props) {
  // const {record} = props;
  // const [customState, customDispatchers] = pageStore.useModel('roleCustom');
  // const [authorityState, authorityDispatchers] = pageStore.useModel('authority');
  //
  // const customData = {customType: false, formCol: 2};

  return (
    <>
      {/*<Box direction="row" spacing={5}>*/}
      {/*  <Button*/}
      {/*    type="normal"*/}
      {/*    size="small"*/}
      {/*    onClick={() => customDispatchers.openRoleAuthorityDialog({roleId: record.id})}*/}
      {/*  > 权限分配 </Button>*/}
      {/*</Box>*/}
      {/*<Dialog*/}
      {/*  v2*/}
      {/*  title="权限分配"*/}
      {/*  visible={customState.dialogAuthorityVisible}*/}
      {/*  onClose={() => customDispatchers.setState({*/}
      {/*    dialogAuthorityVisible: false,*/}
      {/*    recordId: '',*/}
      {/*  })}*/}
      {/*  onOk={() => customDispatchers.okRoleAuthorityDialog({*/}
      {/*    roleId: customState.recordId,*/}
      {/*    authorityIds: customState.selectAuthorities,*/}
      {/*  })}*/}
      {/*  style={{width: '90%'}}*/}
      {/*>*/}
      {/*  <DataTableTemple*/}
      {/*    visibleLoading={authorityState.authorityLoadingVisible}*/}
      {/*    dataSource={authorityState.authorityTableData}*/}
      {/*    items={authorityState.authorityTable}*/}
      {/*    total={authorityState.authorityTotal}*/}
      {/*    getPage={(authorityCurrent) => authorityDispatchers.authorityPage(authorityCurrent)}*/}
      {/*    primaryKey="id"*/}
      {/*    rowSelection={{*/}
      {/*      onChange: (ids, records) => {*/}
      {/*        console.log(ids, records)*/}
      {/*        customDispatchers.setState({*/}
      {/*          selectAuthorities: ids,*/}
      {/*        })*/}
      {/*      },*/}
      {/*      selectedRowKeys: customState.selectAuthorities,*/}
      {/*    }}*/}
      {/*    customData={customData}*/}
      {/*  />*/}
      {/*</Dialog>*/}
    </>
  );
}

export {CustomColumn};
