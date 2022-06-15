import React, {useEffect} from 'react';
import pageStore from '@/pages/AppService/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/AppService/view/custom/AppService';
import {Dialog} from "@alifd/next";

function AppService() {

  const [state, dispatchers] = pageStore.useModel('appService');

  const [customState, customDispatchers] = pageStore.useModel('appServiceCustom');

  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const [persistentState, persistentDispatchers] = pageStore.useModel('persistent');

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
        sonMethod1={record => dispatchers.pageAuthorityByAppService({
          current: 1,
          id: record.id,
        })}
        son2="实体"
        sonMethod2={record => dispatchers.pagePersistentByAppService({
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
          deleteItem={record => dispatchers.deleteAuthorityByAppService({
            current: authorityState.current,
            id: authorityState.parent,
            record,
          })}
          visibleLoading={authorityState.loadingVisible}
          dataSource={authorityState.tableData}
          items={authorityState.table}
          total={authorityState.total}
          getPage={current => dispatchers.pageAuthorityByAppService({
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
          onOk={() => dispatchers.saveAuthorityByAppService({
            current: authorityState.current,
            id: authorityState.parent,
            formData: {
              ...authorityState.formData,
              appServiceId: authorityState.parent,
            },
          })}
          formDataValue={authorityState.formData}
          formSortCode={String(Number.parseInt(String(authorityState.total)) + 10)}
        />
      </Dialog>
      <Dialog
        v2
        visible={persistentState.divVisible}
        footer={false}
        onClose={() => persistentDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => persistentDispatchers.add()}
          editItem={record => persistentDispatchers.edit(record)}
          deleteItem={record => dispatchers.deletePersistentByAppService({
            current: persistentState.current,
            id: persistentState.parent,
            record,
          })}
          visibleLoading={persistentState.loadingVisible}
          dataSource={persistentState.tableData}
          items={persistentState.table}
          total={persistentState.total}
          getPage={current => dispatchers.pagePersistentByAppService({
            current,
            id: persistentState.parent,
          })}
          primaryKey="id"
          customData={persistentState.customData}
        />
        <DataFormTemple
          customData={persistentState.customData}
          title={persistentState.title}
          visibleDialog={persistentState.visible}
          onClose={() => persistentDispatchers.setState({visible: false})}
          items={persistentState.form}
          dispatchers={value => persistentDispatchers.setDataForm(value)}
          onOk={() => dispatchers.savePersistentByAppService({
            current: persistentState.current,
            id: persistentState.parent,
            formData: {
              ...persistentState.formData,
              appServiceId: persistentState.parent,
            },
          })}
          formDataValue={persistentState.formData}
          formSortCode={String(Number.parseInt(String(persistentState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default AppService;
