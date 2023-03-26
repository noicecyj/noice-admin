import React, {useEffect} from 'react';
import DataTableTemple from "@/components/dataTable";
import DataFormTemple from "@/components/dataForm";
import store from "@/store";

function PageModel(props) {

  const [userState] = store.useModel('user');

  const {
    state,
    dispatchers,
  } = props;

  const {
    findDataTableAndFormByName,
    add,
    page,
    setSearchDataForm,
    edit,
    remove,
    runCustomMethod,
    setDataForm,
    save,
  } = dispatchers;

  useEffect(() => {
    findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        addItem={() => add()}
        search={() => page({
          searchForm: state.searchForm,
          current: 1,
        })}
        reset={() => setSearchDataForm(state.searchDefaultForm)}
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
          current,
        })}
        primaryKey="id"
        searchFormValue={state.searchForm}
        dispatchers={value => setSearchDataForm(value)}
        subData={state.subData}
      />
      <DataFormTemple
        configItems={state.formConfig}
        dispatchers={value => setDataForm(value)}
        onOk={() => save({
          searchForm: state.searchForm,
          current: state.current,
          formData: state.formData,
          user: userState.username,
        })}
        formDataValue={state.formData}
        title={state.title}
        visibleDialog={state.visible}
        onClose={() => dispatchers.setState({visible: false})}
      />
    </>
  );
}

export default PageModel;
