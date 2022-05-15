import React, {useEffect} from 'react';
import pageStore from '@/pages/FirstMenu/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnFirstMenu} from '@/pages/FirstMenu/view/custom/firstMenu';

function FirstMenu() {
  const [firstMenuState, firstMenuDispatchers] = pageStore.useModel('firstMenu');
  const [secondMenuState, secondMenuDispatchers] = pageStore.useModel('secondMenu');

  const [customFirstMenuState, customFirstMenuDispatchers] = pageStore.useModel('customFirstMenu');

  useEffect(() => {
    firstMenuDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [firstMenuDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => firstMenuDispatchers.firstMenuAdd()}
        editItem={record => firstMenuDispatchers.firstMenuEdit(record)}
        deleteItem={record => firstMenuDispatchers.firstMenuDelete({
          record,
          data: {
            pageNumber: firstMenuState.firstMenuCurrent,
          },
        })}
        visibleLoading={firstMenuState.firstMenuLoadingVisible}
        dataSource={firstMenuState.firstMenuTableData}
        items={firstMenuState.firstMenuTable}
        total={firstMenuState.firstMenuTotal}
        getPage={firstMenuCurrent => firstMenuDispatchers.firstMenuPage(firstMenuCurrent)}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            firstMenuDispatchers.setState({firstMenuId: record.id});
            secondMenuDispatchers.onRowClick({selected, record});
          },
          selectedRowKeys: [
            secondMenuState.firstMenuId,
          ],
        }}
        primaryKey="id"
        customData={firstMenuState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnFirstMenu value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customFirstMenuDispatchers.customMethod1()}
        customMethod2={() => customFirstMenuDispatchers.customMethod2()}
        customMethod3={() => customFirstMenuDispatchers.customMethod3()}
        customMethodName1={customFirstMenuState.customMethodName1}
        customMethodName2={customFirstMenuState.customMethodName2}
        customMethodName3={customFirstMenuState.customMethodName3}
      />
      <DataFormTemple
        customData={firstMenuState.customData}
        title={firstMenuState.firstMenuTitle}
        visibleDialog={firstMenuState.firstMenuVisible}
        onClose={() => firstMenuDispatchers.setState({firstMenuVisible: false})}
        items={[...firstMenuState.firstMenuForm, ...customFirstMenuState.customFrom]}
        dispatchers={value => firstMenuDispatchers.setDataForm(value)}
        onOk={() => firstMenuDispatchers.firstMenuSave({
          firstMenuFormData: firstMenuState.firstMenuFormData,
          pageNumber: firstMenuState.firstMenuCurrent,
        })}
        formDataValue={firstMenuState.firstMenuFormData}
        formSortCode={String(Number.parseInt(String(firstMenuState.firstMenuTotal)) + 10)}
      />
    </>
  );
}

export default FirstMenu;
