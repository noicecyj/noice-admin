import React, {useEffect} from 'react';
import pageStore from '@/pages/Persistent/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';

function Persistent() {

  const [state, dispatchers] = pageStore.useModel('persistent');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        addItem={() => dispatchers.add()}
        search={() => dispatchers.search(state.searchForm)}
        reset={() => dispatchers.reset()}
        editItem={record => dispatchers.edit(record)}
        deleteItem={record => dispatchers.delete({
          current: state.current,
          record,
        })}
        visibleLoading={state.loadingVisible}
        dataSource={state.tableData}
        configItems={state.tableConfig}
        searchItems={state.tableSearch}
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
        customData={state.customData}
        title={state.title}
        visibleDialog={state.visible}
        onClose={() => dispatchers.setState({visible: false})}
        items={[...state.form]}
        dispatchers={value => dispatchers.setDataForm(value)}
        onOk={() => dispatchers.save({
          current: state.current,
          formData: state.formData,
        })}
        formDataValue={state.formData}
        formSortCode={String(Number.parseInt(String(state.total)) + 10)}
      />
    </>
  );
}

export default Persistent;
