/* eslint-disable no-unused-vars */
import { ResponsiveGrid, Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import CustomEntityName from '@/pages/EntityName/view/custom/entityName';
import styles from '@/pages/EntityName/index.module.scss';

const { Cell } = ResponsiveGrid;

function EntityName() {
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');
  const [entityState, entityDispatchers] = pageStore.useModel('entity');
  const [customEntityState, customEntityDispatchers] = pageStore.useModel('customEntity');

  useEffect(() => {
    entityNameDispatchers.findDataTableAndFormByName();
  }, [entityNameDispatchers]);

  const entityNameRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => entityNameDispatchers.entityNameEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => entityNameDispatchers.entityNameDelete({
        record,
        data: {
          pageNumber: entityNameState.entityNameCurrent,
        },
      }),
    });
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => entityNameDispatchers.entityNameEdit()}> 添加菜单 </Button>
          </div>
          <DataTableTemple
            visibleLoading={entityNameState.entityNameLoadingVisible}
            dataSource={entityNameState.entityNameTableData}
            items={entityNameState.entityNameTable}
            total={entityNameState.entityNameTotal}
            getPage={(entityNameCurrent) => entityNameDispatchers.entityNamePage({
              pageNumber: entityNameCurrent,
            })}
            rowSelection={{
              mode: 'single',
              onSelect: (selected, record) => {
                entityDispatchers.onRowClick(selected, record);
              },
            }}
            pageRender={entityNameRender}
          />
        </div>
      </Cell>
      <DataFormTemple
        title="菜单"
        visibleDialog={entityNameState.entityNameVisible}
        onClose={() => entityNameDispatchers.setState({ entityNameVisible: false })}
        items={entityNameState.entityNameFormItem}
        dispatchers={(value) => entityNameDispatchers.setDataForm(value)}
        onOk={() => entityNameDispatchers.entityNameSave({
          ...entityNameState.entityNameFormData,
          pageNumber: entityNameState.entityNameCurrent,
        })}
        formDataValue={entityNameState.entityNameFormData}
      />
      {/* <CustomEntityName
        entityNameState={entityNameState}
        entityNameDispatchers={entityNameDispatchers}
      /> */}
    </ResponsiveGrid>
  );
}

export default EntityName;
