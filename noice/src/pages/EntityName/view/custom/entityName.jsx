import React from 'react';
import pageStore from '@/pages/EntityName/store';
import { Button } from '@alifd/next';

function CustomColumnEntityName(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => customEntityNameDispatchers.createEntityFile({
          id: record.id,
        })}
      > 生成代码
      </Button>
    </>
  );
}

export { CustomColumnEntityName };

