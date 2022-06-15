import React, {useEffect} from 'react';
import pageStore from '@/pages/Persistent/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/Persistent/view/custom/Persistent';
import {Dialog} from "@alifd/next";

function Persistent() {

  const [state, dispatchers] = pageStore.useModel('persistent');

  const [customState, customDispatchers] = pageStore.useModel('persistentCustom');

  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const [propertyState, propertyDispatchers] = pageStore.useModel('property');

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
        son1="权限"
        sonMethod1={record => dispatchers.pageAuthorityByPersistent({
          current: 1,
          id: record.id,
        })}
        son2="属性"
        sonMethod2={record => dispatchers.pagePropertyByPersistent({
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
        visible={authorityState.divVisible}
        footer={false}
        onClose={() => authorityDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => authorityDispatchers.add()}
          editItem={record => authorityDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteAuthorityByPersistent({
            current: authorityState.current,
            id: authorityState.parent,
            record,
          })}
          visibleLoading={authorityState.loadingVisible}
          dataSource={authorityState.tableData}
          items={authorityState.table}
          total={authorityState.total}
          getPage={current => dispatchers.pageAuthorityByPersistent({
            current,
            id: authorityState.parent,
          })}
          primaryKey="id"
          customData={authorityState.customData}
        />
        <DataFormTemple
          customData={authorityState.customData}
          title={authorityState.title}
          visibleDialog={authorityState.visible}
          onClose={() => authorityDispatchers.setState({visible: false})}
          items={authorityState.form}
          dispatchers={value => authorityDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveAuthorityByPersistent({
            current: authorityState.current,
            id: authorityState.parent,
            formData: {
              ...authorityState.formData,
              persistentId: authorityState.parent,
            },
          })}
          formDataValue={authorityState.formData}
          formSortCode={String(Number.parseInt(String(authorityState.total)) + 10)}
        />
      </Dialog>
      <Dialog
        v2
        visible={propertyState.divVisible}
        footer={false}
        onClose={() => propertyDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => propertyDispatchers.add()}
          editItem={record => propertyDispatchers.edit(record)}
          deleteItem={record => dispatchers.deletePropertyByPersistent({
            current: propertyState.current,
            id: propertyState.parent,
            record,
          })}
          visibleLoading={propertyState.loadingVisible}
          dataSource={propertyState.tableData}
          items={propertyState.table}
          total={propertyState.total}
          getPage={current => dispatchers.pagePropertyByPersistent({
            current,
            id: propertyState.parent,
          })}
          primaryKey="id"
          customData={propertyState.customData}
        />
        <DataFormTemple
          customData={propertyState.customData}
          title={propertyState.title}
          visibleDialog={propertyState.visible}
          onClose={() => propertyDispatchers.setState({visible: false})}
          items={propertyState.form}
          dispatchers={value => propertyDispatchers.setDataForm(value)}
          onOk={() => dispatchers.savePropertyByPersistent({
            current: propertyState.current,
            id: propertyState.parent,
            formData: {
              ...propertyState.formData,
              persistentId: propertyState.parent,
            },
          })}
          formDataValue={propertyState.formData}
          formSortCode={String(Number.parseInt(String(propertyState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default Persistent;
