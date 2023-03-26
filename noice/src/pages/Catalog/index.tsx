import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Catalog/store";

function CatalogPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Catalog');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default CatalogPage;
