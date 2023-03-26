import React from 'react';
import PageModel from "@/components/pageModel";
import pageStore from "@/pages/Dictionary/store";

function DictionaryPage(props) {

  const {history, location} = props;

  const [state, dispatchers] = pageStore.useModel('Dictionary');

  return (
    <PageModel state={state} dispatchers={dispatchers} history={history} location={location}/>
  );
}

export default DictionaryPage;
