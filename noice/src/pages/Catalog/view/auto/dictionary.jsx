import { Dialog } from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnDictionary } from '@/pages/Catalog/view/custom/dictionary';

function Dictionary() {
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

  return (
    <div>
      <Dialog
        visible={dictionaryState.divVisible}
        footer={false}
        onClose={() => dictionaryDispatchers.setState({
          divVisible: false,
          catalogId: '',
        })}
        style={{ width: '90%' }}
      >
        <DataTableTemple
          createItem={() => dictionaryDispatchers.dictionaryEdit()}
          editItem={(record) => dictionaryDispatchers.dictionaryEdit(record)}
          deleteItem={(record) => dictionaryDispatchers.dictionaryDelete({
            record,
            data: {
              pageNumber: dictionaryState.dictionaryCurrent,
            },
          })}
          visibleLoading={dictionaryState.dictionaryLoadingVisible}
          dataSource={dictionaryState.dictionaryTableData}
          items={dictionaryState.dictionaryTable}
          total={dictionaryState.dictionaryTotal}
          primaryKey="id"
          getPage={(dictionaryCurrent) => dictionaryDispatchers.dictionaryPage({ dictionaryCurrent, pid: dictionaryState.catalogId })}
          columnRender={entityState.customType ? (value, index, record) => {
            return (
              <CustomColumnEntity value={value} index={index} record={record} />
            );
          } : null}
        />
      </Dialog>
      <DataFormTemple
        title="菜单"
        visibleDialog={dictionaryState.dictionaryVisible}
        onClose={() => dictionaryDispatchers.setState({ dictionaryVisible: false })}
        items={dictionaryState.dictionaryForm}
        dispatchers={(value) => dictionaryDispatchers.setDataForm(value)}
        onOk={() => dictionaryDispatchers.dictionarySave({
          dictionaryFormData: dictionaryState.dictionaryFormData,
          pageNumber: dictionaryState.dictionaryCurrent,
          pid: dictionaryState.catalogId,
        })}
        formDataValue={dictionaryState.dictionaryFormData}
      />
    </div>
  );
}

export default Dictionary;
