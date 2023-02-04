import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/UserRole/store";

function UserRolePage() {

  const [state, dispatchers] = pageStore.useModel('UserRole');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default UserRolePage;
