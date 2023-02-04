import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTable/store";

function PersistentTablePage() {

  const [state, dispatchers] = pageStore.useModel('PersistentTable');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentTablePage;
