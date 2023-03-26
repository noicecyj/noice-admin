import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/AppService/store";

function AppServicePage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('AppService');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default AppServicePage;
