/* eslint-disable no-unused-vars */
import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';
import styles from './index.module.scss';

function CustomDictionary(props) {
  const { dictionaryState, dictionaryDispatchers } = props;
  const [customDictionaryState, customDictionaryDispatchers] = pageStore.useModel('customDictionary');
  const formItemLayout = {
    labelCol: {
      fixedSpan: 6,
    },
    wrapperCol: {
      span: 40,
    },
  };

  return (
    <div />
  );
}

export default CustomDictionary;
