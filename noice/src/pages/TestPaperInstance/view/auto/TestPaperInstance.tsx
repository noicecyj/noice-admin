import React, {useEffect} from 'react';
import pageStore from '@/pages/TestPaperInstance/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/TestPaperInstance/view/custom/TestPaperInstance';
import {Dialog} from "@alifd/next";

function TestPaperInstance() {

  const [state, dispatchers] = pageStore.useModel('testPaperInstance');

  const [customState, customDispatchers] = pageStore.useModel('testPaperInstanceCustom');

  const [questionInstanceState, questionInstanceDispatchers] = pageStore.useModel('questionInstance');

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
        son1="试题实例"
        sonMethod1={record => dispatchers.pageQuestionInstanceByTestPaperInstance({
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
        visible={questionInstanceState.divVisible}
        footer={false}
        onClose={() => questionInstanceDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => questionInstanceDispatchers.add()}
          editItem={record => questionInstanceDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteQuestionInstanceByTestPaperInstance({
            current: questionInstanceState.current,
            id: questionInstanceState.parent,
            record,
          })}
          visibleLoading={questionInstanceState.loadingVisible}
          dataSource={questionInstanceState.tableData}
          items={questionInstanceState.table}
          total={questionInstanceState.total}
          getPage={current => dispatchers.pageQuestionInstanceByTestPaperInstance({
            current,
            id: questionInstanceState.parent,
          })}
          primaryKey="id"
          customData={questionInstanceState.customData}
        />
        <DataFormTemple
          customData={questionInstanceState.customData}
          title={questionInstanceState.title}
          visibleDialog={questionInstanceState.visible}
          onClose={() => questionInstanceDispatchers.setState({visible: false})}
          items={questionInstanceState.form}
          dispatchers={value => questionInstanceDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveQuestionInstanceByTestPaperInstance({
            current: questionInstanceState.current,
            id: questionInstanceState.parent,
            formData: {
              ...questionInstanceState.formData,
              testPaperInstanceId: questionInstanceState.parent,
            },
          })}
          formDataValue={questionInstanceState.formData}
          formSortCode={String(Number.parseInt(String(questionInstanceState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default TestPaperInstance;
