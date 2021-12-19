/* eslint-disable no-unused-vars */
import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';
import styles from './index.module.scss';

function CustomCatalog(props) {
  const { catalogState, catalogDispatchers } = props;
  const [customCatalogState, customCatalogDispatchers] = pageStore.useModel('customCatalog');
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

export default CustomCatalog;
