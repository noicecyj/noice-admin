import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentFormConfig/store";

function PersistentFormConfigPage() {

  const [state, dispatchers] = pageStore.useModel('PersistentFormConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PersistentFormConfigPage;
