import enterpriseService from '@/pages/Enterprise/services/auto/enterprise';
import initService from '@/services/init';

export default {

  namespace: 'enterprise',

  state: {
    enterpriseTitle: '添加',
    enterpriseTableData: [],
    enterpriseVisible: false,
    enterpriseFormData: {},
    enterpriseLoadingVisible: true,
    enterpriseTotal: 0,
    enterpriseCurrent: 1,
    enterpriseForm: [],
    enterpriseTable: [],
    enterpriseId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async enterprisePage(enterpriseCurrent) {
      const dataRes = await enterpriseService.enterprisePage(enterpriseCurrent);
      const payload = {
        enterpriseTableData: dataRes.data.results,
        enterpriseTotal: dataRes.data.total,
        enterpriseCurrent,
        enterpriseLoadingVisible: false,
      };
      dispatch.enterprise.setState(payload);
    },
    async enterpriseAdd() {
      const payload = {
        enterpriseFormData: {},
        enterpriseTitle: '添加',
        enterpriseVisible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    async enterpriseEdit(data) {
      const enterprise = await enterpriseService.findEnterpriseById(data.id);
      const fromData = {
        ...enterprise.data,
      };
      const payload = {
        enterpriseFormData: fromData,
        enterpriseTitle: '编辑',
        enterpriseVisible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    async enterpriseDelete(data) {
      await enterpriseService.enterpriseDelete(data.record.id);
      await this.enterprisePage(data.data.pageNumber);
      const payload = {
        enterpriseVisible: false,
      };
      dispatch.enterprise.setState(payload);
    },
    async enterpriseSave(data) {
      await enterpriseService.enterpriseSave(data.enterpriseFormData);
      await this.enterprisePage(data.pageNumber);
      const payload = {
        enterpriseVisible: false,
      };
      dispatch.enterprise.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        enterpriseFormData: data,
      };
      dispatch.enterprise.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('enterprise');
      await this.enterprisePage(1);
      const payload = {
        enterpriseTable: ret.data.dataTable,
        enterpriseForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.enterprise.setState(payload);
    },
  }),
};
