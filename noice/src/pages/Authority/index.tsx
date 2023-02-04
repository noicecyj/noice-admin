import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Authority/store";

function AuthorityPage() {

  const [state, dispatchers] = pageStore.useModel('Authority');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default AuthorityPage;
