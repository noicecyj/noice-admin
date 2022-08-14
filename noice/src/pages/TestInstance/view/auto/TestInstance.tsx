import React, {useEffect} from 'react';
import pageStore from '@/pages/TestInstance/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/TestInstance/view/custom/TestInstance';
import {Dialog} from "@alifd/next";

function TestInstance() {

  const [state, dispatchers] = pageStore.useModel('testInstance');

  const [customState, customDispatchers] = pageStore.useModel('testInstanceCustom');

  const [testInstanceAnswerState, testInstanceAnswerDispatchers] = pageStore.useModel('testInstanceAnswer');

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
        sonMethod1={record => dispatchers.pageTestInstanceAnswerByTestInstance({
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
        visible={testInstanceAnswerState.divVisible}
        footer={false}
        onClose={() => testInstanceAnswerDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => testInstanceAnswerDispatchers.add()}
          editItem={record => testInstanceAnswerDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteTestInstanceAnswerByTestInstance({
            current: testInstanceAnswerState.current,
            id: testInstanceAnswerState.parent,
            record,
          })}
          visibleLoading={testInstanceAnswerState.loadingVisible}
          dataSource={testInstanceAnswerState.tableData}
          items={testInstanceAnswerState.table}
          total={testInstanceAnswerState.total}
          getPage={current => dispatchers.pageTestInstanceAnswerByTestInstance({
            current,
            id: testInstanceAnswerState.parent,
          })}
          primaryKey="id"
          customData={testInstanceAnswerState.customData}
        />
        <DataFormTemple
          customData={testInstanceAnswerState.customData}
          title={testInstanceAnswerState.title}
          visibleDialog={testInstanceAnswerState.visible}
          onClose={() => testInstanceAnswerDispatchers.setState({visible: false})}
          items={testInstanceAnswerState.form}
          dispatchers={value => testInstanceAnswerDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveTestInstanceAnswerByTestInstance({
            current: testInstanceAnswerState.current,
            id: testInstanceAnswerState.parent,
            formData: {
              ...testInstanceAnswerState.formData,
              testInstanceId: testInstanceAnswerState.parent,
            },
          })}
          formDataValue={testInstanceAnswerState.formData}
          formSortCode={String(Number.parseInt(String(testInstanceAnswerState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default TestInstance;
