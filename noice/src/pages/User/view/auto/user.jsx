import { ResponsiveGrid, Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/User/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/User/index.module.scss';
import UserCustom from '@/pages/User/view/custom/user';

const { Cell } = ResponsiveGrid;

function User() {
  const [userState, userDispatchers] = pageStore.useModel('user');

  useEffect(() => {
    userDispatchers.findDataTableAndFormByName();
  }, [userDispatchers]);

  const userRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => userDispatchers.userEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const userCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <UserCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => userDispatchers.userDelete({
        record,
        data: {
          pageNumber: userState.userCurrent,
        },
      }),
    });
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => userDispatchers.userEdit()}> 添加 </Button>
          </div>
          <DataTableTemple
            visibleLoading={userState.userLoadingVisible}
            dataSource={userState.userTableData}
            items={userState.userTable}
            total={userState.userTotal}
            getPage={(userCurrent) => userDispatchers.userPage({
              pageNumber: userCurrent,
            })}
            rowSelection={{
              mode: 'single',
              onSelect: (selected, record) => {
                userDispatchers.setState({ userId: record.id });
              },
              selectedRowKeys: [
              ],
            }}
            primaryKey="id"
            pageRender={userRender}
            operationRender={userState.customType ? userCustomRender : null}
          />
        </div>
      </Cell>
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
    </ResponsiveGrid>
  );
}

export default User;
