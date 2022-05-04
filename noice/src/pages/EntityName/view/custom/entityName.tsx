import React from 'react';
import pageStore from '@/pages/EntityName/store';
import {Button} from '@alifd/next';

function CustomColumnEntityName(props) {
  const {record} = props;
  const customEntityNameDispatchers = pageStore.useModelDispatchers('customEntityName');

  return (
    <>
      {
        (record.parentEntityName === null || record.parentEntityName === '') && <Button
          type="normal"
          size="small"
          onClick={() => customEntityNameDispatchers.createEntityFile({id: record.id})}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 生成代码 </Button>
      }
    </>
  );
}

export {CustomColumnEntityName};

