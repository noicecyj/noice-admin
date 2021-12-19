import { ResponsiveGrid, Button, Dialog } from '@alifd/next';
import React, { useEffect } from 'react';
import pageStore from '@/pages/AppService/store';
import DataFormTemple from '@/components/dataForm';
import DataTableTemple from '@/components/dataTable';
import AppServiceCustom from '@/pages/AppService/view/custom/appService';
import styles from './index.module.scss';

const { Cell } = ResponsiveGrid;

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

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => appServiceDispatchers.appServiceDelete({
        record,
        appServiceCurrent: appServiceState.appServiceCurrent,
      }),
    });
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <div className={styles.add}>
            <Button type="primary" onClick={() => appServiceDispatchers.appServiceEdit()}> 添加菜单 </Button>
          </div>
          <DataTableTemple
            visibleLoading={appServiceState.appServiceLoadingVisible}
            dataSource={appServiceState.appServiceTableData}
            items={appServiceState.appServiceTable}
            total={appServiceState.appServiceTotal}
            getPage={(appServiceCurrent) => appServiceDispatchers.appServicePage(appServiceCurrent)}
            pageRender={appServiceRender}
          />
        </div>
      </Cell>
      <DataFormTemple
        title="菜单"
        visibleDialog={appServiceState.appServiceVisible}
        onClose={() => appServiceDispatchers.setState({ appServiceVisible: false })}
        items={appServiceState.appServiceFormItem}
        dispatchers={(value) => appServiceDispatchers.setDataForm(value)}
        onOk={() => appServiceDispatchers.appServiceSave({
          appServiceFormData: appServiceState.appServiceFormData,
          appServiceCurrent: appServiceState.appServiceCurrent,
        })}
        formDataValue={appServiceState.appServiceFormData}
      />
      <AppServiceCustom
        appServiceState={appServiceState}
        appServiceDispatchers={appServiceDispatchers}
      />
    </ResponsiveGrid>
  );
}

export default AppService;
