import React, {useEffect} from 'react';
import pageStore from '@/pages/Authority/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnAuthority} from '@/pages/Authority/view/custom/authority';

function Authority() {
  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const [customAuthorityState, customAuthorityDispatchers] = pageStore.useModel('customAuthority');

  useEffect(() => {
    authorityDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [authorityDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => authorityDispatchers.authorityAdd()}
        editItem={record => authorityDispatchers.authorityEdit(record)}
        deleteItem={record => authorityDispatchers.authorityDelete({
          record,
          data: {
            pageNumber: authorityState.authorityCurrent,
          },
        })}
        visibleLoading={authorityState.authorityLoadingVisible}
        dataSource={authorityState.authorityTableData}
        items={authorityState.authorityTable}
        total={authorityState.authorityTotal}
        getPage={authorityCurrent => authorityDispatchers.authorityPage(authorityCurrent)}
        primaryKey="id"
        customData={authorityState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnAuthority value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customAuthorityDispatchers.customMethod1()}
        customMethod2={() => customAuthorityDispatchers.customMethod2()}
        customMethod3={() => customAuthorityDispatchers.customMethod3()}
        customMethodName1={customAuthorityState.customMethodName1}
        customMethodName2={customAuthorityState.customMethodName2}
        customMethodName3={customAuthorityState.customMethodName3}
      />
      <DataFormTemple
        customData={authorityState.customData}
        title={authorityState.authorityTitle}
        visibleDialog={authorityState.authorityVisible}
        onClose={() => authorityDispatchers.setState({authorityVisible: false})}
        items={[...authorityState.authorityForm, ...customAuthorityState.customFrom]}
        dispatchers={value => authorityDispatchers.setDataForm(value)}
        onOk={() => authorityDispatchers.authoritySave({
          authorityFormData: authorityState.authorityFormData,
          pageNumber: authorityState.authorityCurrent,
        })}
        formDataValue={authorityState.authorityFormData}
        formSortCode={String(Number.parseInt(String(authorityState.authorityTotal)) + 10)}
      />
    </>
  );
}

export default Authority;
