import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentForm/store";

function PersistentFormPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('PersistentForm');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentFormPage;
