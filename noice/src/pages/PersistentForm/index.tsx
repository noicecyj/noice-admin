import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentForm/store";

function PersistentFormPage() {

  const [state, dispatchers] = pageStore.useModel('PersistentForm');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentFormPage;
