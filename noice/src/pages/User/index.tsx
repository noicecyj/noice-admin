import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/User/store";

function UserPage() {

  const [state, dispatchers] = pageStore.useModel('User');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default UserPage;
