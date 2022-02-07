import React, { useEffect } from 'react';
import pageStore from '@/pages/Sql/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomSql(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customSqlState, customSqlDispatchers] = pageStore.useModel('customSql');

  useEffect(() => {
  }, [customSqlDispatchers]);

  return (
    <>
    </>
  );
}

export default CustomSql;
