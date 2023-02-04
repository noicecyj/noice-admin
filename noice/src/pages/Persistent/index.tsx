import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Persistent/store";

function PersistentPage() {

  const [state, dispatchers] = pageStore.useModel('Persistent');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentPage;
