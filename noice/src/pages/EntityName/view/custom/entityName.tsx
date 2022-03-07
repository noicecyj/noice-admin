import React from 'react';
import pageStore from '@/pages/EntityName/store';
import { Button } from '@alifd/next';

function CustomColumnEntityName(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');

  return (
    <>
      {
        record.parentEntityName === null && <Button
          type="normal"
          size="small"
          onClick={() => customEntityNameDispatchers.createEntityFile({ id: record.id })}
        // eslint-disable-next-line react/jsx-closing-tag-location
        > 生成代码 </Button>
      }
    </>
  );
}

export { CustomColumnEntityName };

