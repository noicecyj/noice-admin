import userService from '@/pages/User/services/auto/user';
import initService from '@/services/init';

export default {

  namespace: 'user',

  state: {
    userTitle: '添加',
    userTableData: [],
    userVisible: false,
    userFormData: {},
    userLoadingVisible: true,
    userTotal: 0,
    userCurrent: 1,
    userForm: [],
    userTable: [],
    userId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async userPage(userCurrent) {
      const dataRes = await userService.userPage(userCurrent);
      const payload = {
        userTableData: dataRes.data.results,
        userTotal: dataRes.data.total,
        userCurrent,
        userLoadingVisible: false,
      };
      dispatch.user.setState(payload);
    },
    async userAdd() {
      const payload = {
        userFormData: {},
        userTitle: '添加',
        userVisible: true,
      };
      dispatch.user.setState(payload);
    },
    async userEdit(data) {
      const user = await userService.findUserById(data.id);
      const fromData = {
        ...user.data,
      };
      const payload = {
        userFormData: fromData,
        userTitle: '编辑',
        userVisible: true,
      };
      dispatch.user.setState(payload);
    },
    async userDelete(data) {
      await userService.userDelete(data.record.id);
      await this.userPage(data.data.pageNumber);
      const payload = {
        userVisible: false,
      };
      dispatch.user.setState(payload);
    },
    async userSave(data) {
      await userService.userSave(data.userFormData);
      await this.userPage(data.pageNumber);
      const payload = {
        userVisible: false,
      };
      dispatch.user.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        userFormData: data,
      };
      dispatch.user.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('user');
      await this.userPage(1);
      const payload = {
        userTable: ret.data.dataTable,
        userForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.user.setState(payload);
    },
  }),
};
