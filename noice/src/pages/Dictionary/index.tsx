import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Dictionary/store";

function DictionaryPage() {

  const [state, dispatchers] = pageStore.useModel('Dictionary');

  return (
    <PageModel state={state} dispatchers={dispatchers}/>
  );
}

export default DictionaryPage;
