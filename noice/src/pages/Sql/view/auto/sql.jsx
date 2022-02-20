import React, { useEffect } from 'react';
import pageStore from '@/pages/Sql/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnSql } from '@/pages/Sql/view/custom/sql';

function Sql() {
  const [sqlState, sqlDispatchers] = pageStore.useModel('sql');

  useEffect(() => {
    sqlDispatchers.findDataTableAndFormByName();
  }, [sqlDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => sqlDispatchers.sqlEdit()}
        editItem={(record) => sqlDispatchers.sqlEdit(record)}
        deleteItem={(record) => sqlDispatchers.sqlDelete({
          record,
          data: {
            pageNumber: sqlState.sqlCurrent,
          },
        })}
        visibleLoading={sqlState.sqlLoadingVisible}
        dataSource={sqlState.sqlTableData}
        items={sqlState.sqlTable}
        total={sqlState.sqlTotal}
        getPage={(sqlCurrent) => sqlDispatchers.sqlPage({
          pageNumber: sqlCurrent,
        })}
        primaryKey="id"
        columnRender={sqlState.customType ? (value, index, record) => {
          return (
            <CustomColumnSql value={value} index={index} record={record} />
          );
        } : null}
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
