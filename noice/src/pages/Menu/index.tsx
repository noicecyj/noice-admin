import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Menu/store";

function MenuPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Menu');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default MenuPage;
