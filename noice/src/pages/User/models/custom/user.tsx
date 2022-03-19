import userCustromService from '@/pages/User/services/custom/user';

export default {

  namespace: 'customUser',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    dialogVisible: false,
    recordId: '',
    visibleLoading: false,
    selectRoles: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    customMethod1() {
    },
    customMethod2() {
    },
    customMethod3() {
    },
    async openDialog(data) {
      dispatch.role.findDataTableAndFormByName();
      const ret = await userCustromService.getUserRole(data.userId);
      const customUser = {
        dialogVisible: true,
        recordId: data.userId,
        selectRoles: ret.data,
      };
      dispatch.customUser.setState(customUser);
    },
    async okDialog(data) {
      await userCustromService.setUserRole(data);
      const customUser = {
        dialogVisible: false,
        selectRoles: [],
      };
      dispatch.customUser.setState(customUser);
    },
  }),
};
