import React, {useEffect} from 'react';
import DataTableTemple from "@/components/dataTable";
import store from "@/store";

function PageModel(props) {

  const [userState] = store.useModel('user');

  const {
    state,
    dispatchers,
    auth,
  } = props;

  const {
    findDataTableAndFormByName,
    add,
    page,
    setSearchDataForm,
    setMoreSearchDataForm,
    edit,
    remove,
    runCustomMethod,
    setMoreSearch,
    setDataForm,
    save,
  } = dispatchers;

  useEffect(() => {
    findDataTableAndFormByName(auth).then(r => console.log(r));
  }, [dispatchers, auth]);

  return (
    <>
      <DataTableTemple
        addItem={() => add()}
        search={() => page({
          searchForm: state.searchForm,
          moreSearchForm: state.moreSearchForm,
          current: 1,
          pageUrl: state.urlMap["page"].interfacePath,
        })}
        reset={() => {
          setSearchDataForm({});
          setMoreSearchDataForm({});
        }}
        editItem={record => edit(record)}
        deleteItem={record => remove({
          searchForm: state.searchForm,
          current: state.current,
          record,
        })}
        visibleLoading={state.loadingVisible}
        dataSource={state.tableData}
        configItems={state.tableConfig}
        searchItems={state.tableSearch}
        titleButton={state.titleConfig}
        operationButton={state.tableOperation}
        runCustomMethod={(obj, url) => runCustomMethod(obj, url)}
        total={state.total}
        setPage={current => page({
          searchForm: state.searchForm,
          moreSearchForm: state.moreSearchForm,
          current,
          pageUrl: state.urlMap["page"].interfacePath,
        })}
        primaryKey="id"
        searchFormValue={state.searchForm}
        moreSearchFormValue={state.moreSearchForm}
        searchDispatchers={value => setSearchDataForm(value)}
        moreSearchDispatchers={value => setMoreSearchDataForm(value)}
        subData={state.subData}
        history={history}
        location={location}
      />
    </>
  );
}

export default PageModel;
