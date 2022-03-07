import React, { useEffect } from 'react';
import pageStore from '@/pages/FirstMenu/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomColumnFirstMenu(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customFirstMenuState, customFirstMenuDispatchers] = pageStore.useModel('customFirstMenu');

  useEffect(() => {
  }, [customFirstMenuDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnFirstMenu };
