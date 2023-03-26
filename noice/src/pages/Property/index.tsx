import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Property/store";

function PropertyPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Property');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PropertyPage;
