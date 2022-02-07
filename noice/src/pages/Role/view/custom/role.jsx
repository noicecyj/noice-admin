import React, { useEffect } from 'react';
import pageStore from '@/pages/Role/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomRole(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customRoleState, customRoleDispatchers] = pageStore.useModel('customRole');

  useEffect(() => {
  }, [customRoleDispatchers]);

  return (
    <>
    </>
  );
}

export default CustomRole;
