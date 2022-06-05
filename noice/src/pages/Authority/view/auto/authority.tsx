import React, {useEffect} from 'react';
import pageStore from '@/pages/Authority/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnAuthority} from '@/pages/Authority/view/custom/authority';

function Authority() {
  const [authorityState, authorityDispatchers] = pageStore.useModel('authority');

  const [userState, userDispatchers] = pageStore.useModel('user');

  const [roleState, roleDispatchers] = pageStore.useModelDispatchers('role');

  const [customAuthorityState, customAuthorityDispatchers] = pageStore.useModel('customAuthority');

  useEffect(() => {
    authorityDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [authorityDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => authorityDispatchers.authorityAdd()}
        editItem={record => authorityDispatchers.authorityEdit(record)}
        deleteItem={record => authorityDispatchers.authorityDelete(authorityState.authorityCurrent, record)}
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
        manyToMany1="用户"
        manyToManyMethod1={record => userDispatchers.onManyToManyRowClick(record)}
        manyToMany2="角色"
        manyToManyMethod2={record => roleDispatchers.onManyToManyRowClick(record)}
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
        onOk={() => authorityDispatchers.authoritySave(authorityState.authorityCurrent, authorityState.authorityFormData)}
        formDataValue={authorityState.authorityFormData}
        formSortCode={String(Number.parseInt(String(authorityState.authorityTotal)) + 10)}
      />
    </>
  );
}

export default Authority;
