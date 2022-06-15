import React from 'react';
import pageStore from '@/pages/AppService/store';
import {Button} from "@alifd/next";

function CustomColumn(props) {
  const {record} = props;
  const customAppServiceDispatchers = pageStore.useModelDispatchers('appServiceCustom');

  return (
    <>
      {
        record.appPort !== null && <Button
          type="normal"
          size="small"
          onClick={() => customAppServiceDispatchers.createAppFile({id: record.id})}
          // eslint-disable-next-line react/jsx-closing-tag-location
        > 生成服务 </Button>
      }
    </>
  );
}

export {CustomColumn};
