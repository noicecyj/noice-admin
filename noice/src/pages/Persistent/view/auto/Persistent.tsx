import React, {useEffect} from 'react';
import pageStore from '@/pages/Persistent/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {Box, Button} from "@alifd/next";

function Persistent() {

  const [state, dispatchers] = pageStore.useModel('persistent');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  const columnRender = (value, index, record) => {
    return (
      <Box direction="row" spacing={5}>
        {
          state.tableOperation.map(operation => {
            // @ts-ignore
            let url = operation.persistentTableConfigMethod;
            // @ts-ignore
            let name = operation.persistentTableConfigName;
            return (
              <Button
                type="normal"
                size="small"
                onClick={() => dispatchers.runCustomMethod(record, url)}
              > {name} </Button>
            )
          })
        }
      </Box>
    );
  };

  return (
    <>
      <DataTableTemple
        addItem={() => dispatchers.add()}
        search={() => dispatchers.page({
          searchForm: state.searchForm,
          current: 1,
        })}
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
        columnRender={columnRender}
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
