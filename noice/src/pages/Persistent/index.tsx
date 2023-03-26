import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Persistent/store";

function PersistentPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Persistent');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentPage;
