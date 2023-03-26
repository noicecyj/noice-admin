import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/PersistentFormConfig/store";

function PersistentFormConfigPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('PersistentFormConfig');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default PersistentFormConfigPage;
