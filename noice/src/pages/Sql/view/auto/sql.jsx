import { Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/Sql/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/Sql/index.module.scss';
import SqlCustom from '@/pages/Sql/view/custom/sql';

function Sql() {
  const [sqlState, sqlDispatchers] = pageStore.useModel('sql');

  useEffect(() => {
    sqlDispatchers.findDataTableAndFormByName();
  }, [sqlDispatchers]);

  const sqlRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => sqlDispatchers.sqlEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const sqlCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <SqlCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => sqlDispatchers.sqlDelete({
        record,
        data: {
          pageNumber: sqlState.sqlCurrent,
        },
      }),
    });
  };

  return (
    <>
      <DataTableTemple
        edit={() => sqlDispatchers.sqlEdit()}
        visibleLoading={sqlState.sqlLoadingVisible}
        dataSource={sqlState.sqlTableData}
        items={sqlState.sqlTable}
        total={sqlState.sqlTotal}
        getPage={(sqlCurrent) => sqlDispatchers.sqlPage({
          pageNumber: sqlCurrent,
        })}
        primaryKey="id"
        pageRender={sqlRender}
        operationRender={sqlState.customType ? sqlCustomRender : null}
      />
      <DataFormTemple
        title={sqlState.sqlTitle}
        visibleDialog={sqlState.sqlVisible}
        onClose={() => sqlDispatchers.setState({ sqlVisible: false })}
        items={sqlState.sqlForm}
        dispatchers={(value) => sqlDispatchers.setDataForm(value)}
        onOk={() => sqlDispatchers.sqlSave({
          sqlFormData: sqlState.sqlFormData,
          pageNumber: sqlState.sqlCurrent,
        })}
        formDataValue={sqlState.sqlFormData}
      />
    </>
  );
}

export default Sql;
