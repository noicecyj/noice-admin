import { Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/AppService/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import styles from '@/pages/AppService/index.module.scss';
import AppServiceCustom from '@/pages/AppService/view/custom/appService';

function AppService() {
  const [appServiceState, appServiceDispatchers] = pageStore.useModel('appService');

  useEffect(() => {
    appServiceDispatchers.findDataTableAndFormByName();
  }, [appServiceDispatchers]);

  const appServiceRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Button type="primary" size="small" onClick={() => appServiceDispatchers.appServiceEdit(record)} > 编辑 </Button>
        <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning > 删除 </Button>
      </div>
    );
  };

  const appServiceCustomRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <AppServiceCustom value={value} index={index} record={record} />
      </div>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => appServiceDispatchers.appServiceDelete({
        record,
        data: {
          pageNumber: appServiceState.appServiceCurrent,
        },
      }),
    });
  };

  return (
    <>
      <DataTableTemple
        edit={() => appServiceDispatchers.appServiceEdit()}
        visibleLoading={appServiceState.appServiceLoadingVisible}
        dataSource={appServiceState.appServiceTableData}
        items={appServiceState.appServiceTable}
        total={appServiceState.appServiceTotal}
        getPage={(appServiceCurrent) => appServiceDispatchers.appServicePage({
          pageNumber: appServiceCurrent,
        })}
        primaryKey="id"
        pageRender={appServiceRender}
        operationRender={appServiceState.customType ? appServiceCustomRender : null}
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
