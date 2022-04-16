import authorityService from '@/pages/Authority/services/auto/authority';
import initService from '@/services/init';

export default {

  namespace: 'authority',

  state: {
    authorityTitle: '添加',
    authorityTableData: [],
    authorityVisible: false,
    authorityFormData: {},
    authorityLoadingVisible: true,
    authorityTotal: 0,
    authorityCurrent: 1,
    authorityForm: [],
    authorityTable: [],
    authorityId: '',
    customData: {},
    customType: false,
    formType: 'ONE_LIST',
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async authorityPage(authorityCurrent) {
      const dataRes = await authorityService.authorityPage(authorityCurrent);
      const payload = {
        authorityTableData: dataRes.data.results,
        authorityTotal: dataRes.data.total,
        authorityCurrent,
        authorityLoadingVisible: false,
      };
      dispatch.authority.setState(payload);
    },
    async authorityAdd() {
      const payload = {
        authorityFormData: {},
        authorityTitle: '添加',
        authorityVisible: true,
      };
      dispatch.authority.setState(payload);
    },
    async authorityEdit(data) {
      const authority = await authorityService.findAuthorityById(data.id);
      const fromData = {
        ...authority.data,
      };
      const payload = {
        authorityFormData: fromData,
        authorityTitle: '编辑',
        authorityVisible: true,
      };
      dispatch.authority.setState(payload);
    },
    async authorityDelete(data) {
      await authorityService.authorityDelete(data.record.id);
      await this.authorityPage(data.data.pageNumber);
      const payload = {
        authorityVisible: false,
      };
      dispatch.authority.setState(payload);
    },
    async authoritySave(data) {
      await authorityService.authoritySave(data.authorityFormData);
      await this.authorityPage(data.pageNumber);
      const payload = {
        authorityVisible: false,
      };
      dispatch.authority.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        authorityFormData: data,
      };
      dispatch.authority.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('authority');
      await this.authorityPage(1);
      const payload = {
        authorityTable: ret.data.dataTable,
        authorityForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.authority.setState(payload);
    },
  }),
};
