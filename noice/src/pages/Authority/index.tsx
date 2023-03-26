import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Authority/store";

function AuthorityPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Authority');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default AuthorityPage;
