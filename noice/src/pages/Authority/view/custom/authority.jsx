import React, { useEffect } from 'react';
import pageStore from '@/pages/Authority/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomColumnAuthority(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customAuthorityState, customAuthorityDispatchers] = pageStore.useModel('customAuthority');

  useEffect(() => {
  }, [customAuthorityDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnAuthority };
