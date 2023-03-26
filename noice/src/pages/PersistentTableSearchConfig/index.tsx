import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTableSearchConfig/store";

function PersistentTableSearchConfigPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('PersistentTableSearchConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentTableSearchConfigPage;
