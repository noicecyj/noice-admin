import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTableConfig/store";

function PersistentTableConfigPage() {

  const [state, dispatchers] = pageStore.useModel('PersistentTableConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentTableConfigPage;
