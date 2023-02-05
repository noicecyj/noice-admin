import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Menu/store";

function MenuPage() {

  const [state, dispatchers] = pageStore.useModel('Menu');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default MenuPage;
