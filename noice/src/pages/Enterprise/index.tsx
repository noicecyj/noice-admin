import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Enterprise/store";

function EnterprisePage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Enterprise');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default EnterprisePage;
