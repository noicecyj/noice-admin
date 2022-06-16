import React from 'react';
import pageStore from '@/pages/Persistent/store';
import {Button} from '@alifd/next';

function CustomColumn(props) {
  const {record} = props;
  const customEntityDispatchers = pageStore.useModelDispatchers('persistentCustom');

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => customEntityDispatchers.createEntityFile(record)}
        // eslint-disable-next-line react/jsx-closing-tag-location
      > 生成代码 </Button>
    </>
  );
}

export {CustomColumn};

