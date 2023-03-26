import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/User/store";

function UserPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('User');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default UserPage;
