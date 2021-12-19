/* eslint-disable no-unused-vars */
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import styles from '@/pages/EntityName/index.module.scss';

function CustomEntity(props) {
  const { entityState, entityDispatchers } = props;
  const [customEntityState, customEntityDispatchers] = pageStore.useModel('customEntity');
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

export default CustomEntity;
