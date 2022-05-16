import React from 'react';
import {Box, Button} from "@alifd/next";
import pageStore from '@/pages/User/store';
import DataFormTemple from "@/components/dataForm";

function CustomColumnUser(props) {
  const {record} = props;
  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');

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
    </>
  );
}

export {CustomColumnUser};
