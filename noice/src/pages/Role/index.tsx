import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Role/store";

function RolePage() {

  const [state, dispatchers] = pageStore.useModel('Role');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default RolePage;
