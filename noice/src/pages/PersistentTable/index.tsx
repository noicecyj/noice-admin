import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentTable/store";

function PersistentTablePage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('PersistentTable');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentTablePage;
