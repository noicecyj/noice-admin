import React, {useEffect} from 'react';
import pageStore from '@/pages/AppService/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import {CustomColumnAppService} from '@/pages/AppService/view/custom/appService';

function AppService() {
  const [appServiceState, appServiceDispatchers] = pageStore.useModel('appService');

  const [customAppServiceState, customAppServiceDispatchers] = pageStore.useModel('customAppService');

  useEffect(() => {
    appServiceDispatchers.findDataTableAndFormByName().then(r => console.log(r));
  }, [appServiceDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => appServiceDispatchers.appServiceAdd()}
        editItem={record => appServiceDispatchers.appServiceEdit(record)}
        deleteItem={record => appServiceDispatchers.appServiceDelete({
          record,
          data: {
            pageNumber: appServiceState.appServiceCurrent,
          },
        })}
        visibleLoading={appServiceState.appServiceLoadingVisible}
        dataSource={appServiceState.appServiceTableData}
        items={appServiceState.appServiceTable}
        total={appServiceState.appServiceTotal}
        getPage={appServiceCurrent => appServiceDispatchers.appServicePage(appServiceCurrent)}
        primaryKey="id"
        customData={appServiceState.customData}
        columnRender={(value, index, record) => {
          return (
            <CustomColumnAppService value={value} index={index} record={record}/>
          );
        }}
        customMethod1={() => customAppServiceDispatchers.customMethod1()}
        customMethod2={() => customAppServiceDispatchers.customMethod2()}
        customMethod3={() => customAppServiceDispatchers.customMethod3()}
        customMethodName1={customAppServiceState.customMethodName1}
        customMethodName2={customAppServiceState.customMethodName2}
        customMethodName3={customAppServiceState.customMethodName3}
      />
      <DataFormTemple
        customData={appServiceState.customData}
        title={appServiceState.appServiceTitle}
        visibleDialog={appServiceState.appServiceVisible}
        onClose={() => appServiceDispatchers.setState({appServiceVisible: false})}
        items={[...appServiceState.appServiceForm, ...customAppServiceState.customFrom]}
        dispatchers={value => appServiceDispatchers.setDataForm(value)}
        onOk={() => appServiceDispatchers.appServiceSave({
          appServiceFormData: appServiceState.appServiceFormData,
          pageNumber: appServiceState.appServiceCurrent,
        })}
        formDataValue={appServiceState.appServiceFormData}
        formSortCode={String(Number.parseInt(String(appServiceState.appServiceTotal)) + 10)}
      />
    </>
  );
}

export default AppService;
