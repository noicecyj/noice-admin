import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/UserRole/store";

function UserRolePage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('UserRole');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default UserRolePage;
