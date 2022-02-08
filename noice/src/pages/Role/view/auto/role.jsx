import { ResponsiveGrid, Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/Role/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/Role/index.module.scss';
import RoleCustom from '@/pages/Role/view/custom/role';

const { Cell } = ResponsiveGrid;

function Role() {
  const [roleState, roleDispatchers] = pageStore.useModel('role');

  useEffect(() => {
    roleDispatchers.findDataTableAndFormByName();
  }, [roleDispatchers]);

  const roleRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => roleDispatchers.roleEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const roleCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <RoleCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => roleDispatchers.roleDelete({
        record,
        data: {
          pageNumber: roleState.roleCurrent,
        },
      }),
    });
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => roleDispatchers.roleEdit()}> 添加 </Button>
          </div>
          <DataTableTemple
            visibleLoading={roleState.roleLoadingVisible}
            dataSource={roleState.roleTableData}
            items={roleState.roleTable}
            total={roleState.roleTotal}
            getPage={(roleCurrent) => roleDispatchers.rolePage({
              pageNumber: roleCurrent,
            })}
            primaryKey="id"
            pageRender={roleRender}
            operationRender={roleState.customType ? roleCustomRender : null}
          />
        </div>
      </Cell>
      <DataFormTemple
        title={roleState.roleTitle}
        visibleDialog={roleState.roleVisible}
        onClose={() => roleDispatchers.setState({ roleVisible: false })}
        items={roleState.roleForm}
        dispatchers={(value) => roleDispatchers.setDataForm(value)}
        onOk={() => roleDispatchers.roleSave({
          roleFormData: roleState.roleFormData,
          pageNumber: roleState.roleCurrent,
        })}
        formDataValue={roleState.roleFormData}
      />
    </ResponsiveGrid>
  );
}

export default Role;
