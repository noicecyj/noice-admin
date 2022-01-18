import appServiceService from '@/pages/AppService/services/auto/appService';
import initService from '@/services/init';

export default {

  namespace: 'appService',

  state: {
    appServiceTitle: '添加',
    appServiceTableData: [],
    appServiceVisible: false,
    appServiceFormData: {},
    appServiceLoadingVisible: true,
    appServiceTotal: 0,
    appServiceCurrent: 1,
    appServiceForm: [],
    appServiceTable: [],
    appServiceId: '',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async appServicePage(appServiceCurrent) {
      const dataRes = await appServiceService.appServicePage(appServiceCurrent);
      const payload = {
        appServiceTableData: dataRes.data.results,
        appServiceTotal: dataRes.data.total,
        appServiceCurrent,
        appServiceLoadingVisible: false,
      };
      dispatch.appService.setState(payload);
    },
    async appServiceEdit(data) {
      if (data) {
        const appService = await appServiceService.findAppServiceById(data.id);
        const fromData = {
          ...appService.data,
        };
        const payload = {
          appServiceFormData: fromData,
          appServiceTitle: '编辑',
          appServiceVisible: true,
        };
        dispatch.appService.setState(payload);
      } else {
        const payload = {
          appServiceFormData: {},
          appServiceTitle: '添加',
          appServiceVisible: true,
        };
        dispatch.appService.setState(payload);
      }
    },
    async appServiceDelete(data) {
      await appServiceService.appServiceDelete(data.record.id);
      await this.appServicePage(data.data.pageNumber);
      const payload = {
        appServiceVisible: false,
      };
      dispatch.appService.setState(payload);
    },
    async appServiceSave(data) {
      await appServiceService.appServiceSave(data.appServiceFormData);
      await this.appServicePage(data.pageNumber);
      const payload = {
        appServiceVisible: false,
      };
      dispatch.appService.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        appServiceFormData: data,
      };
      dispatch.appService.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('app_service');
      await this.appServicePage(1);
      const payload = {
        appServiceTable: ret.data.dataTable,
        appServiceForm: ret.data.dataForm,
      };
      dispatch.appService.setState(payload);
    },
  }),
};
