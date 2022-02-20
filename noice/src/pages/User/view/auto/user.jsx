import React, { useEffect } from 'react';
import pageStore from '@/pages/User/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnUser } from '@/pages/User/view/custom/user';

function User() {
  const [userState, userDispatchers] = pageStore.useModel('user');

  useEffect(() => {
    userDispatchers.findDataTableAndFormByName();
  }, [userDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => userDispatchers.userEdit()}
        editItem={(record) => userDispatchers.userEdit(record)}
        deleteItem={(record) => userDispatchers.userDelete({
          record,
          data: {
            pageNumber: userState.userCurrent,
          },
        })}
        visibleLoading={userState.userLoadingVisible}
        dataSource={userState.userTableData}
        items={userState.userTable}
        total={userState.userTotal}
        getPage={(userCurrent) => userDispatchers.userPage({
          pageNumber: userCurrent,
        })}
        primaryKey="id"
        columnRender={userState.customType ? (value, index, record) => {
          return (
            <CustomColumnUser value={value} index={index} record={record} />
          );
        } : null}
      />
      <DataFormTemple
        title={userState.userTitle}
        visibleDialog={userState.userVisible}
        onClose={() => userDispatchers.setState({ userVisible: false })}
        items={userState.userForm}
        dispatchers={(value) => userDispatchers.setDataForm(value)}
        onOk={() => userDispatchers.userSave({
          userFormData: userState.userFormData,
          pageNumber: userState.userCurrent,
        })}
        formDataValue={userState.userFormData}
      />
    </>
  );
}

export default User;
