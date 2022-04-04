import React from 'react';
import OneList from '../dataForm/OneList';
import {Dialog, Form} from '@alifd/next';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function DataForm(props) {
  const {items, dispatchers, onOk, formDataValue, title, visibleDialog, onClose, customType, formType} = props;

  return (
    <Dialog v2 title={title} visible={visibleDialog} footer={false} onClose={onClose} style={{width: '30%'}}>
      <Form style={{width: '100%'}} {...formItemLayout} value={formDataValue} onChange={(value) => dispatchers(value)}>
        <OneList items={items} onOk={onOk} customType={customType}/>
      </Form>
    </Dialog>
  );
}

export default DataForm;
