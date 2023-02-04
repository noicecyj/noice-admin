import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTableSearchConfig/store";

function PersistentTableSearchConfigPage() {

  const [state, dispatchers] = pageStore.useModel('PersistentTableSearchConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentTableSearchConfigPage;
