import React, { useEffect } from 'react';
import pageStore from '@/pages/AppService/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import { CustomColumnAppService } from '@/pages/AppService/view/custom/appService';

function AppService() {
  const [appServiceState, appServiceDispatchers] = pageStore.useModel('appService');

  useEffect(() => {
    appServiceDispatchers.findDataTableAndFormByName();
  }, [appServiceDispatchers]);

  return (
    <>
      <DataTableTemple
        createItem={() => appServiceDispatchers.appServiceEdit()}
        editItem={(record) => appServiceDispatchers.appServiceEdit(record)}
        deleteItem={(record) => appServiceDispatchers.appServiceDelete({
          record,
          data: {
            pageNumber: appServiceState.appServiceCurrent,
          },
        })}
        visibleLoading={appServiceState.appServiceLoadingVisible}
        dataSource={appServiceState.appServiceTableData}
        items={appServiceState.appServiceTable}
        total={appServiceState.appServiceTotal}
        getPage={(appServiceCurrent) => appServiceDispatchers.appServicePage({
          pageNumber: appServiceCurrent,
        })}
        primaryKey="id"
        columnRender={appServiceState.customType ? (value, index, record) => {
          return (
            <CustomColumnAppService value={value} index={index} record={record} />
          );
        } : null}
      />
      <DataFormTemple
        title={appServiceState.appServiceTitle}
        visibleDialog={appServiceState.appServiceVisible}
        onClose={() => appServiceDispatchers.setState({ appServiceVisible: false })}
        items={appServiceState.appServiceForm}
        dispatchers={(value) => appServiceDispatchers.setDataForm(value)}
        onOk={() => appServiceDispatchers.appServiceSave({
          appServiceFormData: appServiceState.appServiceFormData,
          pageNumber: appServiceState.appServiceCurrent,
        })}
        formDataValue={appServiceState.appServiceFormData}
      />
    </>
  );
}

export default AppService;
