import React, { useEffect } from 'react';
import pageStore from '@/pages/User/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomColumnUser(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customUserState, customUserDispatchers] = pageStore.useModel('customUser');

  useEffect(() => {
  }, [customUserDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnUser };
