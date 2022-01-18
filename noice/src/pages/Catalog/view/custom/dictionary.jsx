import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';

const FormItem = Form.Item;
const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomDictionary(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customDictionaryState, customDictionaryDispatchers] = pageStore.useModel('customCatalog');

  useEffect(() => {
  }, [customDictionaryDispatchers]);

  return (
    <>
    </>
  );
}

export default CustomDictionary;
