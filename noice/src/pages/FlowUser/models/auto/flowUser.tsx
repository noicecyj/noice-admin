import flowUserService from '@/pages/FlowUser/services/auto/flowUser';
import initService from '@/services/init';

export default {

  namespace: 'flowUser',

  state: {
    flowUserTitle: '添加',
    flowUserTableData: [],
    flowUserVisible: false,
    flowUserFormData: {},
    flowUserLoadingVisible: true,
    flowUserTotal: 0,
    flowUserCurrent: 1,
    flowUserForm: [],
    flowUserTable: [],
    flowUserId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async flowUserPage(flowUserCurrent) {
      const dataRes = await flowUserService.flowUserPage(flowUserCurrent);
      const payload = {
        flowUserTableData: dataRes.data.results,
        flowUserTotal: dataRes.data.total,
        flowUserCurrent,
        flowUserLoadingVisible: false,
      };
      dispatch.flowUser.setState(payload);
    },
    async flowUserAdd() {
      const payload = {
        flowUserFormData: {},
        flowUserTitle: '添加',
        flowUserVisible: true,
      };
      dispatch.flowUser.setState(payload);
    },
    async flowUserEdit(data) {
      const flowUser = await flowUserService.findFlowUserById(data.id);
      const fromData = {
        ...flowUser.data,
      };
      const payload = {
        flowUserFormData: fromData,
        flowUserTitle: '编辑',
        flowUserVisible: true,
      };
      dispatch.flowUser.setState(payload);
    },
    async flowUserDelete(data) {
      await flowUserService.flowUserDelete(data.record.id);
      await this.flowUserPage(data.data.pageNumber);
      const payload = {
        flowUserVisible: false,
      };
      dispatch.flowUser.setState(payload);
    },
    async flowUserSave(data) {
      await flowUserService.flowUserSave(data.flowUserFormData);
      await this.flowUserPage(data.pageNumber);
      const payload = {
        flowUserVisible: false,
      };
      dispatch.flowUser.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        flowUserFormData: data,
      };
      dispatch.flowUser.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('flow_user');
      await this.flowUserPage(1);
      const payload = {
        flowUserTable: ret.data.dataTable,
        flowUserForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.flowUser.setState(payload);
    },
  }),
};
