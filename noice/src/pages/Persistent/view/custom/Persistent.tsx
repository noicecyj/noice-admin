import React from 'react';
import pageStore from '@/pages/Persistent/store';
import {Box, Button} from '@alifd/next';

function CustomColumn(props) {
  const {record} = props;
  const customEntityDispatchers = pageStore.useModelDispatchers('persistentCustom');

  return (
    <>
      <Box direction="row" spacing={5}>
        <Button
          type="normal"
          size="small"
          onClick={() => customEntityDispatchers.createEntityFile(record)}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 生成代码 </Button>
        <Button
          type="normal"
          size="small"
          onClick={() => customEntityDispatchers.deleteEntityFile(record)}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 删除代码 </Button>
      </Box>
    </>
  );
}

export {CustomColumn};

