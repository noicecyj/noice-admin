import React, {useEffect} from 'react';
import pageStore from '@/pages/Bpmn/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnBpmn} from '@/pages/Bpmn/view/custom/bpmn';

function Bpmn() {
  const [bpmnState, bpmnDispatchers] = pageStore.useModel('bpmn');

  const [customBpmnState, customBpmnDispatchers] = pageStore.useModel('customBpmn');

  useEffect(() => {
    bpmnDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [bpmnDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => bpmnDispatchers.bpmnAdd()}
        editItem={record => bpmnDispatchers.bpmnEdit(record)}
        deleteItem={record => bpmnDispatchers.bpmnDelete({
          record,
          data: {
            pageNumber: bpmnState.bpmnCurrent,
          },
        })}
        visibleLoading={bpmnState.bpmnLoadingVisible}
        dataSource={bpmnState.bpmnTableData}
        items={bpmnState.bpmnTable}
        total={bpmnState.bpmnTotal}
        getPage={bpmnCurrent => bpmnDispatchers.bpmnPage(bpmnCurrent)}
        primaryKey="id"
        customType={bpmnState.customType}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnBpmn value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customBpmnDispatchers.customMethod1()}
        customMethod2={() => customBpmnDispatchers.customMethod2()}
        customMethod3={() => customBpmnDispatchers.customMethod3()}
        customMethodName1={customBpmnState.customMethodName1}
        customMethodName2={customBpmnState.customMethodName2}
        customMethodName3={customBpmnState.customMethodName3}
      />
      <DataFormTemple
        formType={bpmnState.formType}
        title={bpmnState.bpmnTitle}
        visibleDialog={bpmnState.bpmnVisible}
        onClose={() => bpmnDispatchers.setState({bpmnVisible: false})}
        items={[...bpmnState.bpmnForm, ...customBpmnState.customFrom]}
        dispatchers={value => bpmnDispatchers.setDataForm(value)}
        onOk={() => bpmnDispatchers.bpmnSave({
          bpmnFormData: bpmnState.bpmnFormData,
          pageNumber: bpmnState.bpmnCurrent,
        })}
        formDataValue={bpmnState.bpmnFormData}
      />
    </>
  );
}

export default Bpmn;
