import React, { useEffect } from 'react';
import pageStore from '@/pages/FirstMenu/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnFirstMenu } from '@/pages/FirstMenu/view/custom/firstMenu';

function FirstMenu() {
  const [firstMenuState, firstMenuDispatchers] = pageStore.useModel('firstMenu');
  const [secondMenuState, secondMenuDispatchers] = pageStore.useModel('secondMenu');

  useEffect(() => {
    firstMenuDispatchers.findDataTableAndFormByName();
  }, [firstMenuDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => firstMenuDispatchers.firstMenuEdit()}
        editItem={(record) => firstMenuDispatchers.firstMenuEdit(record)}
        deleteItem={(record) => firstMenuDispatchers.firstMenuDelete({
          record,
          data: {
            pageNumber: firstMenuState.firstMenuCurrent,
          },
        })}
        visibleLoading={firstMenuState.firstMenuLoadingVisible}
        dataSource={firstMenuState.firstMenuTableData}
        items={firstMenuState.firstMenuTable}
        total={firstMenuState.firstMenuTotal}
        getPage={(firstMenuCurrent) => firstMenuDispatchers.firstMenuPage({
          pageNumber: firstMenuCurrent,
        })}
        rowSelection={{
          mode: 'single',
          onSelect: (selected, record) => {
            firstMenuDispatchers.setState({ firstMenuId: record.id });
            secondMenuDispatchers.onRowClick({ selected, record });
          },
          selectedRowKeys: [
            secondMenuState.firstMenuId,
          ],
        }}
        primaryKey="id"
        columnRender={firstMenuState.customType ? (value, index, record) => {
          return (
            <CustomColumnFirstMenu value={value} index={index} record={record} />
          );
        } : null}
      />
      <DataFormTemple
        title={firstMenuState.firstMenuTitle}
        visibleDialog={firstMenuState.firstMenuVisible}
        onClose={() => firstMenuDispatchers.setState({ firstMenuVisible: false })}
        items={firstMenuState.firstMenuForm}
        dispatchers={(value) => firstMenuDispatchers.setDataForm(value)}
        onOk={() => firstMenuDispatchers.firstMenuSave({
          firstMenuFormData: firstMenuState.firstMenuFormData,
          pageNumber: firstMenuState.firstMenuCurrent,
        })}
        formDataValue={firstMenuState.firstMenuFormData}
      />
    </>
  );
}

export default FirstMenu;
