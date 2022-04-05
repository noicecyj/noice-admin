import React, {useEffect} from 'react';
import pageStore from '@/pages/Sql/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnSql} from '@/pages/Sql/view/custom/sql';

function Sql() {
  const [sqlState, sqlDispatchers] = pageStore.useModel('sql');

  const [customSqlState, customSqlDispatchers] = pageStore.useModel('customSql');

  useEffect(() => {
    sqlDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [sqlDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={data => sqlDispatchers.sqlEdit(data)}
        editItem={record => sqlDispatchers.sqlEdit(record)}
        deleteItem={record => sqlDispatchers.sqlDelete({
          record,
          data: {
            pageNumber: sqlState.sqlCurrent,
          },
        })}
        visibleLoading={sqlState.sqlLoadingVisible}
        dataSource={sqlState.sqlTableData}
        items={sqlState.sqlTable}
        total={sqlState.sqlTotal}
        getPage={sqlCurrent => sqlDispatchers.sqlPage(sqlCurrent)}
        primaryKey="id"
        columnRender={sqlState.customType ? (value, index, record) => {
          return (
            <CustomColumnSql value={value} index={index} record={record}/>
          );
        } : null}
        customMethod1={() => customSqlDispatchers.customMethod1()}
        customMethod2={() => customSqlDispatchers.customMethod2()}
        customMethod3={() => customSqlDispatchers.customMethod3()}
        customMethodName1={customSqlState.customMethodName1}
        customMethodName2={customSqlState.customMethodName2}
        customMethodName3={customSqlState.customMethodName3}
      />
      <DataFormTemple
        formType={sqlState.formType}
        customType={sqlState.customType}
        title={sqlState.sqlTitle}
        visibleDialog={sqlState.sqlVisible}
        onClose={() => sqlDispatchers.setState({sqlVisible: false})}
        items={sqlState.sqlForm}
        dispatchers={value => sqlDispatchers.setDataForm(value)}
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
