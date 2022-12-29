import React, {useEffect} from 'react';
import pageStore from '@/pages/Persistent/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumn} from '@/pages/Persistent/view/custom/Persistent';

function Persistent() {

  const [state, dispatchers] = pageStore.useModel('persistent');

  useEffect(() => {
    dispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [dispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => dispatchers.add()}
        editItem={record => dispatchers.edit(record)}
        deleteItem={record => dispatchers.delete({
          current: state.current,
          record,
        })}
        visibleLoading={state.loadingVisible}
        dataSource={state.tableData}
        items={state.table}
        total={state.total}
        getPage={current => dispatchers.page(current)}
        primaryKey="id"
        customData={state.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumn value={value} index={index} record={record}/>
          );
        }}
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
