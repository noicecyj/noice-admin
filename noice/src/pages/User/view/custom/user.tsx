import React from 'react';
import {Box, Button} from "@alifd/next";
import pageStore from '@/pages/User/store';
import DataFormTemple from "@/components/dataForm";

function CustomColumn(props) {
  const {record} = props;
  const [customState, customDispatchers] = pageStore.useModel('userCustom');

  const customData = {customType: false, formCol: 2};

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customDispatchers.setState({
            dialogPasswordVisible: true,
            recordId: record.id,
          })}
        > 重置密码 </Button>
      </Box>
      <DataFormTemple
        title='重置密码'
        visibleDialog={customState.dialogPasswordVisible}
        onClose={() => customDispatchers.setState({dialogPasswordVisible: false})}
        items={customState.passwordForm}
        dispatchers={(value) => customDispatchers.setDataForm(value)}
        onOk={() => customDispatchers.resetPassword({
          ...customState.passwordFormData,
          userId: customState.recordId,
        })}
        formDataValue={customState.passwordFormData}
        customData={customData}
      />
    </>
  );
}

export {CustomColumn};
