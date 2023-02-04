import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Property/store";

function PropertyPage() {

  const [state, dispatchers] = pageStore.useModel('Property');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default PropertyPage;
