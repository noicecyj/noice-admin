import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/RoleAuthority/store";

function RoleAuthorityPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('RoleAuthority');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default RoleAuthorityPage;
