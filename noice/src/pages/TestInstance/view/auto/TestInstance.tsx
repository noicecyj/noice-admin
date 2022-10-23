import React, {useEffect} from 'react';
import pageStore from '@/pages/TestInstance/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/TestInstance/view/custom/TestInstance';
import {Dialog} from "@alifd/next";

function TestInstance() {

  const [state, dispatchers] = pageStore.useModel('testInstance');

  const [customState, customDispatchers] = pageStore.useModel('testInstanceCustom');

  const [questionInstanceAnswerState, questionInstanceAnswerDispatchers] = pageStore.useModel('questionInstanceAnswer');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => dispatchers.add()}
        editItem={record => dispatchers.edit(record)}
        deleteItem={record => dispatchers.delete({
          current: state.current,
          record,
        })}
        visibleLoading={state.loadingVisible}
        dataSource={state.tableData}
        items={state.table}
        total={state.total}
        getPage={current => dispatchers.page(current)}
        primaryKey="id"
        customData={state.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumn value={value} index={index} record={record}/>
          );
        }}
        son1="考试答卷"
        sonMethod1={record => dispatchers.pageQuestionInstanceAnswerByTestInstance({
          current: 1,
          id: record.id,
        })}
        customMethod1={() => customDispatchers.customMethod1()}
        customMethod2={() => customDispatchers.customMethod2()}
        customMethod3={() => customDispatchers.customMethod3()}
        customMethodName1={customState.customMethodName1}
        customMethodName2={customState.customMethodName2}
        customMethodName3={customState.customMethodName3}
      />
      <DataFormTemple
        customData={state.customData}
        title={state.title}
        visibleDialog={state.visible}
        onClose={() => dispatchers.setState({visible: false})}
        items={[...state.form, ...customState.customFrom]}
        dispatchers={value => dispatchers.setDataForm(value)}
        onOk={() => dispatchers.save({
          current: state.current,
          formData: state.formData,
        })}
        formDataValue={state.formData}
        formSortCode={String(Number.parseInt(String(state.total)) + 10)}
      />
      <Dialog
        v2
        visible={questionInstanceAnswerState.divVisible}
        footer={false}
        onClose={() => questionInstanceAnswerDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => questionInstanceAnswerDispatchers.add()}
          editItem={record => questionInstanceAnswerDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteQuestionInstanceAnswerByTestInstance({
            current: questionInstanceAnswerState.current,
            id: questionInstanceAnswerState.parent,
            record,
          })}
          visibleLoading={questionInstanceAnswerState.loadingVisible}
          dataSource={questionInstanceAnswerState.tableData}
          items={questionInstanceAnswerState.table}
          total={questionInstanceAnswerState.total}
          getPage={current => dispatchers.pageQuestionInstanceAnswerByTestInstance({
            current,
            id: questionInstanceAnswerState.parent,
          })}
          primaryKey="id"
          customData={questionInstanceAnswerState.customData}
        />
        <DataFormTemple
          customData={questionInstanceAnswerState.customData}
          title={questionInstanceAnswerState.title}
          visibleDialog={questionInstanceAnswerState.visible}
          onClose={() => questionInstanceAnswerDispatchers.setState({visible: false})}
          items={questionInstanceAnswerState.form}
          dispatchers={value => questionInstanceAnswerDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveQuestionInstanceAnswerByTestInstance({
            current: questionInstanceAnswerState.current,
            id: questionInstanceAnswerState.parent,
            formData: {
              ...questionInstanceAnswerState.formData,
              testInstanceId: questionInstanceAnswerState.parent,
            },
          })}
          formDataValue={questionInstanceAnswerState.formData}
          formSortCode={String(Number.parseInt(String(questionInstanceAnswerState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default TestInstance;
