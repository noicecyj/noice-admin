import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTableConfig/store";

function PersistentTableConfigPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('PersistentTableConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentTableConfigPage;
