import React from 'react';
import pageStore from '@/pages/EntityName/store';
import { Button } from '@alifd/next';

function CustomEntityName(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => customEntityNameDispatchers.createEntityFile({
          id: entityNameState.entityNameId, isReWaite: true,
        })}
      > 生成代码
      </Button>
    </>
  );
}

export default CustomEntityName;

