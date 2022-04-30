import React from 'react';
import pageStore from '@/pages/Bpmn/store';
import ReactBpmn from 'react-bpmn';
import {Box, Button, Dialog} from "@alifd/next";

function CustomColumnBpmn(props) {
  const {record} = props;
  const [customBpmnState, customBpmnDispatchers] = pageStore.useModel('customBpmn');

  function onShown() {
    console.log('diagram shown');
  }

  function onLoading() {
    console.log('diagram loading');
  }

  function onError(err) {
    console.log('failed to show diagram');
  }

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customBpmnDispatchers.setState({
            dialogBpmnVisible: true,
            recordId: record.id,
          })}
        > 设计流程图 </Button>
      </Box>
      <Dialog
        v2
        title="设计流程图"
        visible={customBpmnState.dialogBpmnVisible}
        onClose={() => customBpmnDispatchers.setState({
          dialogBpmnVisible: false,
          recordId: '',
        })}
        onOk={() => customBpmnDispatchers.okBpmnDialog({
          bpmnXml: customBpmnState.bpmnXml,
          recordId: customBpmnState.recordId,
        })}
        style={{width: '90%'}}
        height='800px'
      >
        <ReactBpmn
          url="/diagram_1.bpmn"
          onShown={ onShown }
          onLoading={ onLoading }
          onError={ onError }
        />
      </Dialog>
    </>
  );
}

export {CustomColumnBpmn};
