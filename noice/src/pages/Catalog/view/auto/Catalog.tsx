import React, {useEffect} from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/Catalog/view/custom/Catalog';
import {Dialog} from "@alifd/next";

function Catalog() {

  const [state, dispatchers] = pageStore.useModel('catalog');

  const [customState, customDispatchers] = pageStore.useModel('catalogCustom');

  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

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
        son1="字典"
        sonMethod1={record => dispatchers.pageDictionaryByCatalog({
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
        visible={dictionaryState.divVisible}
        footer={false}
        onClose={() => dictionaryDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => dictionaryDispatchers.add()}
          editItem={record => dictionaryDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteDictionaryByCatalog({
            current: dictionaryState.current,
            id: dictionaryState.parent,
            record,
          })}
          visibleLoading={dictionaryState.loadingVisible}
          dataSource={dictionaryState.tableData}
          items={dictionaryState.table}
          total={dictionaryState.total}
          getPage={current => dispatchers.pageDictionaryByCatalog({
            current,
            id: dictionaryState.parent,
          })}
          primaryKey="id"
          customData={dictionaryState.customData}
        />
        <DataFormTemple
          customData={dictionaryState.customData}
          title={dictionaryState.title}
          visibleDialog={dictionaryState.visible}
          onClose={() => dictionaryDispatchers.setState({visible: false})}
          items={dictionaryState.form}
          dispatchers={value => dictionaryDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveDictionaryByCatalog({
            current: dictionaryState.current,
            id: dictionaryState.parent,
            formData: {
              ...dictionaryState.formData,
              catalogId: dictionaryState.parent,
            },
          })}
          formDataValue={dictionaryState.formData}
          formSortCode={String(Number.parseInt(String(dictionaryState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default Catalog;
