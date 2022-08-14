import React from "react";
import {Button} from "@alifd/next";
import pageStore from "@/pages/Test/store";

function CustomColumn(props) {

  const {record} = props;
  const customTestDispatchers = pageStore.useModelDispatchers('testCustom');

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => customTestDispatchers.startTest(record)}
        // eslint-disable-next-line react/jsx-closing-tag-location
      > 开始考试 </Button>
    </>
  );

}

export {CustomColumn};
