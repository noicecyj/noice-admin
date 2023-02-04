import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/AppService/store";

function AppServicePage() {

  const [state, dispatchers] = pageStore.useModel('AppService');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default AppServicePage;
