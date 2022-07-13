import React, {useEffect} from 'react';
import pageStore from '@/pages/TestPaper/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/TestPaper/view/custom/TestPaper';
import {Dialog} from "@alifd/next";

function TestPaper() {

  const [state, dispatchers] = pageStore.useModel('testPaper');

  const [customState, customDispatchers] = pageStore.useModel('testPaperCustom');

  const [testPaperConfigState, testPaperConfigDispatchers] = pageStore.useModel('testPaperConfig');

  const [testPaperInstanceState, testPaperInstanceDispatchers] = pageStore.useModel('testPaperInstance');

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
        son1="试卷配置"
        sonMethod1={record => dispatchers.pageTestPaperConfigByTestPaper({
          current: 1,
          id: record.id,
        })}
        son2="试卷实例"
        sonMethod2={record => dispatchers.pageTestPaperInstanceByTestPaper({
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
        visible={testPaperConfigState.divVisible}
        footer={false}
        onClose={() => testPaperConfigDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => testPaperConfigDispatchers.add()}
          editItem={record => testPaperConfigDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteTestPaperConfigByTestPaper({
            current: testPaperConfigState.current,
            id: testPaperConfigState.parent,
            record,
          })}
          visibleLoading={testPaperConfigState.loadingVisible}
          dataSource={testPaperConfigState.tableData}
          items={testPaperConfigState.table}
          total={testPaperConfigState.total}
          getPage={current => dispatchers.pageTestPaperConfigByTestPaper({
            current,
            id: testPaperConfigState.parent,
          })}
          primaryKey="id"
          customData={testPaperConfigState.customData}
        />
        <DataFormTemple
          customData={testPaperConfigState.customData}
          title={testPaperConfigState.title}
          visibleDialog={testPaperConfigState.visible}
          onClose={() => testPaperConfigDispatchers.setState({visible: false})}
          items={testPaperConfigState.form}
          dispatchers={value => testPaperConfigDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveTestPaperConfigByTestPaper({
            current: testPaperConfigState.current,
            id: testPaperConfigState.parent,
            formData: {
              ...testPaperConfigState.formData,
              testPaperId: testPaperConfigState.parent,
            },
          })}
          formDataValue={testPaperConfigState.formData}
          formSortCode={String(Number.parseInt(String(testPaperConfigState.total)) + 10)}
        />
      </Dialog>
      <Dialog
        v2
        visible={testPaperInstanceState.divVisible}
        footer={false}
        onClose={() => testPaperInstanceDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => testPaperInstanceDispatchers.add()}
          editItem={record => testPaperInstanceDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteTestPaperInstanceByTestPaper({
            current: testPaperInstanceState.current,
            id: testPaperInstanceState.parent,
            record,
          })}
          visibleLoading={testPaperInstanceState.loadingVisible}
          dataSource={testPaperInstanceState.tableData}
          items={testPaperInstanceState.table}
          total={testPaperInstanceState.total}
          getPage={current => dispatchers.pageTestPaperInstanceByTestPaper({
            current,
            id: testPaperInstanceState.parent,
          })}
          primaryKey="id"
          customData={testPaperInstanceState.customData}
        />
        <DataFormTemple
          customData={testPaperInstanceState.customData}
          title={testPaperInstanceState.title}
          visibleDialog={testPaperInstanceState.visible}
          onClose={() => testPaperInstanceDispatchers.setState({visible: false})}
          items={testPaperInstanceState.form}
          dispatchers={value => testPaperInstanceDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveTestPaperInstanceByTestPaper({
            current: testPaperInstanceState.current,
            id: testPaperInstanceState.parent,
            formData: {
              ...testPaperInstanceState.formData,
              testPaperId: testPaperInstanceState.parent,
            },
          })}
          formDataValue={testPaperInstanceState.formData}
          formSortCode={String(Number.parseInt(String(testPaperInstanceState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default TestPaper;
