import React, {useEffect} from 'react';
import pageStore from '@/pages/Enterprise/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnEnterprise} from '@/pages/Enterprise/view/custom/enterprise';

function Enterprise() {
  const [enterpriseState, enterpriseDispatchers] = pageStore.useModel('enterprise');

  const [customEnterpriseState, customEnterpriseDispatchers] = pageStore.useModel('customEnterprise');

  useEffect(() => {
    enterpriseDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [enterpriseDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => enterpriseDispatchers.enterpriseAdd()}
        editItem={record => enterpriseDispatchers.enterpriseEdit(record)}
        deleteItem={record => enterpriseDispatchers.enterpriseDelete({
          record,
          data: {
            pageNumber: enterpriseState.enterpriseCurrent,
          },
        })}
        visibleLoading={enterpriseState.enterpriseLoadingVisible}
        dataSource={enterpriseState.enterpriseTableData}
        items={enterpriseState.enterpriseTable}
        total={enterpriseState.enterpriseTotal}
        getPage={enterpriseCurrent => enterpriseDispatchers.enterprisePage(enterpriseCurrent)}
        primaryKey="id"
        customData={enterpriseState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnEnterprise value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customEnterpriseDispatchers.customMethod1()}
        customMethod2={() => customEnterpriseDispatchers.customMethod2()}
        customMethod3={() => customEnterpriseDispatchers.customMethod3()}
        customMethodName1={customEnterpriseState.customMethodName1}
        customMethodName2={customEnterpriseState.customMethodName2}
        customMethodName3={customEnterpriseState.customMethodName3}
      />
      <DataFormTemple
        customData={enterpriseState.customData}
        title={enterpriseState.enterpriseTitle}
        visibleDialog={enterpriseState.enterpriseVisible}
        onClose={() => enterpriseDispatchers.setState({enterpriseVisible: false})}
        items={[...enterpriseState.enterpriseForm, ...customEnterpriseState.customFrom]}
        dispatchers={value => enterpriseDispatchers.setDataForm(value)}
        onOk={() => enterpriseDispatchers.enterpriseSave({
          enterpriseFormData: enterpriseState.enterpriseFormData,
          pageNumber: enterpriseState.enterpriseCurrent,
        })}
        formDataValue={enterpriseState.enterpriseFormData}
      />
    </>
  );
}

export default Enterprise;
