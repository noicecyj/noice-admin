import appServiceService from '../../services/auto/appService';
import initService from '../../../../services/init';

export default {

  namespace: 'appService',

  state: {
    appServiceTableData: [],
    appServiceVisible: false,
    appServiceFormData: {},
    appServiceLoadingVisible: true,
    appServiceTotal: 0,
    appServiceCurrent: 1,
    appServiceFormItem: [],
    appServiceForm: [],
    appServiceTable: [],
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
        appServiceTotal: dataRes.data.totalElements,
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
          appServiceVisible: true,
        };
        dispatch.appService.setState(payload);
      } else {
        const payload = {
          appServiceFormData: {},
          appServiceVisible: true,
        };
        dispatch.appService.setState(payload);
      }
    },
    async appServiceDelete(data) {
      await appServiceService.appServiceDelete(data.record);
      this.appServicePage(data.appServiceCurrent);
      const payload = {
        appServiceVisible: false,
      };
      dispatch.appService.setState(payload);
    },
    async appServiceSave(data) {
      await appServiceService.appServiceSave(data.appServiceFormData);
      this.appServicePage(data.appServiceCurrent);
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
      const data = await initService.findDataTableAndFormByName('app_service');
      this.appServicePage(1);
      const payload = {
        appServiceTable: data.dataTable,
        appServiceForm: data.dataForm,
      };
      dispatch.appService.setState(payload);
    },
  }),
};
