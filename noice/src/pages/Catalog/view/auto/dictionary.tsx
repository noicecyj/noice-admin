import {Dialog} from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/Catalog/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnDictionary} from '@/pages/Catalog/view/custom/dictionary';

function Dictionary() {
  const [dictionaryState, dictionaryDispatchers] = pageStore.useModel('dictionary');

  const [customDictionaryState, customDictionaryDispatchers] = pageStore.useModel('customDictionary');

  return (
    <div>
      <Dialog
        v2
        visible={dictionaryState.divVisible}
        footer={false}
        onClose={() => dictionaryDispatchers.setState({
          divVisible: false,
          catalogId: '',
        })}
        style={{width: '90%'}}
      >
        <DataTableTemple
          createItem={() => dictionaryDispatchers.dictionaryAdd()}
          editItem={record => dictionaryDispatchers.dictionaryEdit(record)}
          deleteItem={record => dictionaryDispatchers.dictionaryDelete({
            record,
            data: {
              pageNumber: dictionaryState.dictionaryCurrent,
              pid: dictionaryState.catalogId,
            },
          })}
          visibleLoading={dictionaryState.dictionaryLoadingVisible}
          dataSource={dictionaryState.dictionaryTableData}
          items={dictionaryState.dictionaryTable}
          total={dictionaryState.dictionaryTotal}
          primaryKey="id"
          getPage={dictionaryCurrent => dictionaryDispatchers.dictionaryPage({
            dictionaryCurrent,
            pid: dictionaryState.catalogId
          })}
          customData={dictionaryState.customData}
          columnRender={(value, index, record) => {
            return (
              <CustomColumnDictionary value={value} index={index} record={record}/>
            );
          }}
          customMethod1={() => customDictionaryDispatchers.customMethod1()}
          customMethod2={() => customDictionaryDispatchers.customMethod2()}
          customMethod3={() => customDictionaryDispatchers.customMethod3()}
          customMethodName1={customDictionaryState.customMethodName1}
          customMethodName2={customDictionaryState.customMethodName2}
          customMethodName3={customDictionaryState.customMethodName3}
        />
      </Dialog>
      <DataFormTemple
        customData={dictionaryState.customData}
        title={dictionaryState.dictionaryTitle}
        visibleDialog={dictionaryState.dictionaryVisible}
        onClose={() => dictionaryDispatchers.setState({dictionaryVisible: false})}
        items={[...dictionaryState.dictionaryForm, ...customDictionaryState.customFrom]}
        dispatchers={value => dictionaryDispatchers.setDataForm(value)}
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
