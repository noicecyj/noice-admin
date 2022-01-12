/* eslint-disable no-unused-vars */
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomEntity(props) {
  const { value, index, record } = props;
  const [customEntityState, customEntityDispatchers] = pageStore.useModel('customEntity');

  useEffect(() => {

  }, [customEntityDispatchers]);


  return (
    <>
    </>
  );
}

export default CustomEntity;
