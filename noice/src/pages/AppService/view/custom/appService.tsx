import React, { useEffect } from 'react';
import pageStore from '@/pages/AppService/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomColumnAppService(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customAppServiceState, customAppServiceDispatchers] = pageStore.useModel('customAppService');

  useEffect(() => {
  }, [customAppServiceDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnAppService };
