import React from 'react';
import pageStore from '@/pages/Entity/store';
import {Button} from '@alifd/next';

function CustomColumnEntity(props) {
  const {record} = props;
  const customEntityDispatchers = pageStore.useModelDispatchers('customEntity');

  return (
    <>
      {
        record.entity === null && <Button
          type="normal"
          size="small"
          onClick={() => customEntityDispatchers.createEntityFile(record)}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 生成代码 </Button>
      }
    </>
  );
}

export {CustomColumnEntity};

