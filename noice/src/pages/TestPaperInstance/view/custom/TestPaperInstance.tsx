import React from "react";
import {Button} from "@alifd/next";
import pageStore from "@/pages/TestPaperInstance/store";

function CustomColumn(props) {

  const {record} = props;
  const customTestPaperInstanceDispatchers = pageStore.useModelDispatchers('testPaperInstanceCustom');

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => customTestPaperInstanceDispatchers.createTestPaperInstance(record)}
        // eslint-disable-next-line react/jsx-closing-tag-location
      > 生成试卷 </Button>
    </>
  );

}

export {CustomColumn};
