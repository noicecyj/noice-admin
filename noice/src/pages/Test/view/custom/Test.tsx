import React from "react";
import {Button, Checkbox, Dialog, List, Radio} from "@alifd/next";
import pageStore from "@/pages/Test/store";

function CustomColumn(props) {

  const {record} = props;
  const customTestDispatchers = pageStore.useModelDispatchers('testCustom');
  const customTestState = pageStore.useModelState('testCustom')

  const startTestConfirm = (record) => {
    Dialog.confirm({
      title: '开始考试',
      content: '是否开始考试',
      onOk: () => customTestDispatchers.startTest(record),
    });
  };

  const questionTypeHandler = (item) => {
    if (item.questionInstanceType == '单选题') {
      return <Radio.Group direction='ver'>
        {!!item.questionInstanceOptionA && <Radio value={1}>
          {item.questionInstanceOptionA}
        </Radio>}
        {!!item.questionInstanceOptionB && <Radio value={2}>
          {item.questionInstanceOptionB}
        </Radio>}
        {!!item.questionInstanceOptionC && <Radio value={3}>
          {item.questionInstanceOptionC}
        </Radio>}
        {!!item.questionInstanceOptionD && <Radio value={4}>
          {item.questionInstanceOptionD}
        </Radio>}
        {!!item.questionInstanceOptionE && <Radio value={5}>
          {item.questionInstanceOptionE}
        </Radio>}
        {!!item.questionInstanceOptionF && <Radio value={6}>
          {item.questionInstanceOptionF}
        </Radio>}
      </Radio.Group>
    } else if (item.questionInstanceType == '多选题') {
      return <Checkbox.Group direction='ver'>
        {!!item.questionInstanceOptionA && <Checkbox value={1}>
          {item.questionInstanceOptionA}
        </Checkbox>}
        {!!item.questionInstanceOptionB && <Checkbox value={2}>
          {item.questionInstanceOptionB}
        </Checkbox>}
        {!!item.questionInstanceOptionC && <Checkbox value={3}>
          {item.questionInstanceOptionC}
        </Checkbox>}
        {!!item.questionInstanceOptionD && <Checkbox value={4}>
          {item.questionInstanceOptionD}
        </Checkbox>}
        {!!item.questionInstanceOptionE && <Checkbox value={5}>
          {item.questionInstanceOptionE}
        </Checkbox>}
        {!!item.questionInstanceOptionF && <Checkbox value={6}>
          {item.questionInstanceOptionF}
        </Checkbox>}
      </Checkbox.Group>
    } else if (item.questionInstanceType == '判断题') {
      return <Radio.Group itemDirection='ver'>
        <Radio value={1}>正确</Radio>
        <Radio value={1}>错误</Radio>
      </Radio.Group>
    } else {
      return <div>wtf</div>
    }
  }

  return (
    <>
      <Button
        type="normal"
        size="small"
        onClick={() => startTestConfirm(record)}
      > 开始考试 </Button>
      <Dialog
        v2
        visible={customTestState.divVisible}
        footer={false}
        onClose={() => customTestDispatchers.setState({
          divVisible: false,
        })}
        style={{width: '100%'}}
      >
        <h1>{record.testName}</h1>
        <h2>考试时间：{record.testTime} 分钟</h2>
        <List
          dataSource={customTestState.questionList}
          renderItem={(item, i) => (
            <List.Item key={i}>
              <h2>{i+1}{'. '}{item.questionInstanceContent}</h2>
              {questionTypeHandler(item)}
            </List.Item>
          )}
        />
      </Dialog>
    </>
  );

}

export {CustomColumn};
