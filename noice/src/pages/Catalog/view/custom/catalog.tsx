import React, { useEffect } from 'react';
import pageStore from '@/pages/Catalog/store';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomColumnCatalog(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customCatalogState, customCatalogDispatchers] = pageStore.useModel('customCatalog');

  useEffect(() => {
  }, [customCatalogDispatchers]);

  return (
    <>
    </>
  );
}

export { CustomColumnCatalog };
