import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Role/store";

function RolePage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Role');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default RolePage;
