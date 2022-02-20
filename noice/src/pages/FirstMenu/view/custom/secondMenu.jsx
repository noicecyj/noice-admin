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

function CustomColumnSecondMenu(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customSecondMenuState, customSecondMenuDispatchers] = pageStore.useModel('customFirstMenu');

  useEffect(() => {
  }, [customSecondMenuDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnSecondMenu };
