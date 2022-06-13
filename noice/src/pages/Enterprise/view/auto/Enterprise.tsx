import React, {useEffect} from 'react';
import pageStore from '@/pages/Enterprise/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/Enterprise/view/custom/Enterprise';
import {Dialog} from "@alifd/next";

function Enterprise() {
  const [state, dispatchers] = pageStore.useModel('enterprise');

  const [customState, customDispatchers] = pageStore.useModel('enterpriseCustom');

  const [userState, userDispatchers] = pageStore.useModel('user');

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
        son1="用户"
        sonMethod1={record => dispatchers.pageUserByEnterprise({
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
        visible={userState.divVisible}
        footer={false}
        onClose={() => userDispatchers.setState({
          divVisible: false,
          parent: "",
        })}
        style={{width: '100%'}}
      >
        <DataTableTemple
          createItem={() => userDispatchers.add()}
          editItem={record => userDispatchers.edit(record)}
          deleteItem={record => dispatchers.deleteUserByEnterprise({
            current: userState.current,
            id: userState.parent,
            record,
          })}
          visibleLoading={userState.loadingVisible}
          dataSource={userState.tableData}
          items={userState.table}
          total={userState.total}
          getPage={current => dispatchers.pageUserByEnterprise({
            current,
            id: userState.parent,
          })}
          primaryKey="id"
          customData={userState.customData}
        />
        <DataFormTemple
          customData={userState.customData}
          title={userState.title}
          visibleDialog={userState.visible}
          onClose={() => userDispatchers.setState({visible: false})}
          items={userState.form}
          dispatchers={value => userDispatchers.setDataForm(value)}
          onOk={() => dispatchers.saveUserByEnterprise({
            current: userState.current,
            id: userState.parent,
            formData: {
              ...userState.formData,
              enterpriseId: userState.parent,
            },
          })}
          formDataValue={userState.formData}
          formSortCode={String(Number.parseInt(String(userState.total)) + 10)}
        />
      </Dialog>
    </>
  );
}

export default Enterprise;
