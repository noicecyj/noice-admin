import React, {useEffect} from 'react';
import pageStore from '@/pages/Role/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/Role/view/custom/role';
import {Dialog} from "@alifd/next";

function Role() {

  const [state, dispatchers] = pageStore.useModel('role');

  const [customState, customDispatchers] = pageStore.useModel('roleCustom');

  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => dispatchers.add()}
        editItem={record => dispatchers.edit(record)}
        deleteItem={record => dispatchers.delete(state.current, record)}
        visibleLoading={state.loadingVisible}
        dataSource={state.tableData}
        items={state.table}
        total={state.total}
        getPage={roleCurrent => dispatchers.page(roleCurrent)}
        primaryKey="id"
        customData={state.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumn value={value} index={index} record={record}/>
          );
        }}
        manyToMany1="权限"
        manyToManyMethod1={record => dispatchers.authorityByRole(record)}
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
        onClose={() => dispatchers.setState({roleVisible: false})}
        items={[...state.form, ...customState.customFrom]}
        dispatchers={value => dispatchers.setDataForm(value)}
        onOk={() => dispatchers.save(state.current, state.formData)}
        formDataValue={state.formData}
        formSortCode={String(Number.parseInt(String(state.total)) + 10)}
      />
      <Dialog
        v2
        title="角色"
        visible={authorityState.divVisible}
        onClose={() => authorityDispatchers.setState({
          divVisible: false,
          parent: "",
          select: [],
        })}
        onOk={() => dispatchers.authoritySaveRole({
          parent: authorityState.parent,
          select: authorityState.select
        })}
        style={{width: '90%'}}
      >
        <DataTableTemple
          customData={{customType:false}}
          visibleLoading={authorityState.loadingVisible}
          dataSource={authorityState.tableData}
          items={authorityState.table}
          total={authorityState.total}
          getPage={(current) => authorityDispatchers.page(current)}
          primaryKey="id"
          rowSelection={{
            onChange: (ids) => {
              authorityDispatchers.setState({
                select: ids,
              })
            },
            selectedRowKeys: authorityState.select,
          }}
        />
      </Dialog>
    </>
  );
}

export default Role;
