import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Catalog/store";

function CatalogPage() {

  const [state, dispatchers] = pageStore.useModel('Catalog');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default CatalogPage;
