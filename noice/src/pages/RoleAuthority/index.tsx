import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/RoleAuthority/store";

function RoleAuthorityPage() {

  const [state, dispatchers] = pageStore.useModel('RoleAuthority');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default RoleAuthorityPage;
