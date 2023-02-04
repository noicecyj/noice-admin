import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Enterprise/store";

function EnterprisePage() {

  const [state, dispatchers] = pageStore.useModel('Enterprise');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default EnterprisePage;
