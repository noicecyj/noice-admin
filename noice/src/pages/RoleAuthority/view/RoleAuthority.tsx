import React, {useEffect} from 'react';
import pageStore from '@/pages/RoleAuthority/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import store from "@/store";

function RoleAuthority() {

  const [state, dispatchers] = pageStore.useModel('RoleAuthority');

  const [userState] = store.useModel('user');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        addItem={() => dispatchers.add()}
        search={() => dispatchers.page({
          searchForm: state.searchForm,
          current: 1,
        })}
        reset={() => dispatchers.setSearchDataForm(state.searchDefaultForm)}
        editItem={record => dispatchers.edit(record)}
        deleteItem={record => dispatchers.delete({
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
        runCustomMethod={(record, url) => dispatchers.runCustomMethod(record, url)}
        total={state.total}
        setPage={current => dispatchers.page({
          searchForm: state.searchForm,
          current,
        })}
        primaryKey="id"
        searchFormValue={state.searchForm}
        dispatchers={value => dispatchers.setSearchDataForm(value)}
      />
      <DataFormTemple
        configItems={state.formConfig}
        dispatchers={value => dispatchers.setDataForm(value)}
        onOk={() => dispatchers.save({
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

export default RoleAuthority;
