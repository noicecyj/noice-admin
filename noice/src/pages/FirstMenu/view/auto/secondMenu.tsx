import {Dialog} from '@alifd/next';
import React from 'react';
import pageStore from '@/pages/FirstMenu/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnSecondMenu} from '@/pages/FirstMenu/view/custom/secondMenu';

function SecondMenu() {
  const [secondMenuState, secondMenuDispatchers] = pageStore.useModel('secondMenu');

  const [customSecondMenuState, customSecondMenuDispatchers] = pageStore.useModel('customSecondMenu');

  return (
    <div>
      <Dialog
        v2
        visible={secondMenuState.divVisible}
        footer={false}
        onClose={() => secondMenuDispatchers.setState({
          divVisible: false,
          firstMenuId: '',
        })}
        style={{width: '90%'}}
      >
        <DataTableTemple
          createItem={() => secondMenuDispatchers.secondMenuAdd()}
          editItem={record => secondMenuDispatchers.secondMenuEdit(record)}
          deleteItem={record => secondMenuDispatchers.secondMenuDelete({
            record,
            data: {
              pageNumber: secondMenuState.secondMenuCurrent,
              pid: secondMenuState.firstMenuId,
            },
          })}
          visibleLoading={secondMenuState.secondMenuLoadingVisible}
          dataSource={secondMenuState.secondMenuTableData}
          items={secondMenuState.secondMenuTable}
          total={secondMenuState.secondMenuTotal}
          primaryKey="id"
          getPage={secondMenuCurrent => secondMenuDispatchers.secondMenuPage({
            secondMenuCurrent,
            pid: secondMenuState.firstMenuId
          })}
          customType={secondMenuState.customType}
          columnRender={(value, index, record) => {
            return (
              <CustomColumnSecondMenu value={value} index={index} record={record}/>
            );
          }}
          customMethod1={() => customSecondMenuDispatchers.customMethod1()}
          customMethod2={() => customSecondMenuDispatchers.customMethod2()}
          customMethod3={() => customSecondMenuDispatchers.customMethod3()}
          customMethodName1={customSecondMenuState.customMethodName1}
          customMethodName2={customSecondMenuState.customMethodName2}
          customMethodName3={customSecondMenuState.customMethodName3}
        />
      </Dialog>
      <DataFormTemple
        formType={secondMenuState.formType}
        customType={secondMenuState.customType}
        title={secondMenuState.secondMenuTitle}
        visibleDialog={secondMenuState.secondMenuVisible}
        onClose={() => secondMenuDispatchers.setState({secondMenuVisible: false})}
        items={[...secondMenuState.secondMenuForm, ...customSecondMenuState.customFrom]}
        dispatchers={value => secondMenuDispatchers.setDataForm(value)}
        onOk={() => secondMenuDispatchers.secondMenuSave({
          secondMenuFormData: secondMenuState.secondMenuFormData,
          pageNumber: secondMenuState.secondMenuCurrent,
          pid: secondMenuState.firstMenuId,
        })}
        formDataValue={secondMenuState.secondMenuFormData}
      />
    </div>
  );
}

export default SecondMenu;
