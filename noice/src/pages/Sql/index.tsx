import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Sql/store";

function SqlPage() {

  const [state, dispatchers] = pageStore.useModel('Sql');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default SqlPage;
