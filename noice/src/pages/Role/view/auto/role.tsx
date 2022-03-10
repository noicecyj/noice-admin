import React, {useEffect} from 'react';
import pageStore from '@/pages/Role/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnRole} from '@/pages/Role/view/custom/role';

function Role() {
  const [roleState, roleDispatchers] = pageStore.useModel('role');

  const [customRoleState, customRoleDispatchers] = pageStore.useModel('customRole');

  useEffect(() => {
    roleDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [roleDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => roleDispatchers.roleEdit()}
        editItem={(record) => roleDispatchers.roleEdit(record)}
        deleteItem={(record) => roleDispatchers.roleDelete({
          record,
          data: {
            pageNumber: roleState.roleCurrent,
          },
        })}
        visibleLoading={roleState.roleLoadingVisible}
        dataSource={roleState.roleTableData}
        items={roleState.roleTable}
        total={roleState.roleTotal}
        getPage={(roleCurrent) => roleDispatchers.rolePage(roleCurrent)}
        primaryKey="id"
        columnRender={roleState.customType ? (value, index, record) => {
          return (
            <CustomColumnRole value={value} index={index} record={record}/>
          );
        } : null}
        customMethod1={() => customRoleDispatchers.customMethod1()}
        customMethod2={() => customRoleDispatchers.customMethod2()}
        customMethod3={() => customRoleDispatchers.customMethod3()}
        customMethodName1={customRoleState.customMethodName1}
        customMethodName2={customRoleState.customMethodName2}
        customMethodName3={customRoleState.customMethodName3}
      />
      <DataFormTemple
        title={roleState.roleTitle}
        visibleDialog={roleState.roleVisible}
        onClose={() => roleDispatchers.setState({roleVisible: false})}
        items={roleState.roleForm}
        dispatchers={(value) => roleDispatchers.setDataForm(value)}
        onOk={() => roleDispatchers.roleSave({
          roleFormData: roleState.roleFormData,
          pageNumber: roleState.roleCurrent,
        })}
        formDataValue={roleState.roleFormData}
      />
    </>
  );
}

export default Role;
