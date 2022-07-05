import React, {useEffect} from 'react';
import pageStore from '@/pages/QuestionBase/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/QuestionBase/view/custom/QuestionBase';
import {Dialog} from "@alifd/next";

function QuestionBase() {

  const [state, dispatchers] = pageStore.useModel('questionBase');

  const [customState, customDispatchers] = pageStore.useModel('questionBaseCustom');

  const [questionState, questionDispatchers] = pageStore.useModel('question');

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
        son1="题目"
        sonMethod1={record => dispatchers.pageQuestionByQuestionBase({
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
        visible={questionState.divVisible}
        footer={false}
        onClose={() => questionDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => questionDispatchers.add()}
          editItem={record => questionDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteQuestionByQuestionBase({
            current: questionState.current,
            id: questionState.parent,
            record,
          })}
          visibleLoading={questionState.loadingVisible}
          dataSource={questionState.tableData}
          items={questionState.table}
          total={questionState.total}
          getPage={current => dispatchers.pageQuestionByQuestionBase({
            current,
            id: questionState.parent,
          })}
          primaryKey="id"
          customData={questionState.customData}
        />
        <DataFormTemple
          customData={questionState.customData}
          title={questionState.title}
          visibleDialog={questionState.visible}
          onClose={() => questionDispatchers.setState({visible: false})}
          items={questionState.form}
          dispatchers={value => questionDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveQuestionByQuestionBase({
            current: questionState.current,
            id: questionState.parent,
            formData: {
              ...questionState.formData,
              questionBaseId: questionState.parent,
            },
          })}
          formDataValue={questionState.formData}
          formSortCode={String(Number.parseInt(String(questionState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default QuestionBase;
