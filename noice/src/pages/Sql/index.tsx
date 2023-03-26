import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Sql/store";

function SqlPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Sql');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default SqlPage;
