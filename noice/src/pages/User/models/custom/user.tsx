import userCustomService from '@/pages/User/services/custom/user';

export default {

  namespace: 'customUser',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    recordId: '',
    dialogRoleVisible: false,
    dialogAuthorityVisible: false,
    visibleRoleLoading: false,
    visibleAuthorityLoading: false,
    selectRoles: [],
    selectAuthorities: [],
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
    async openUserRoleDialog(data) {
      dispatch.role.findDataTableAndFormByName();
      const ret = await userCustomService.getUserRole(data.userId);
      const customUser = {
        dialogRoleVisible: true,
        recordId: data.userId,
        selectRoles: ret.data,
      };
      dispatch.customUser.setState(customUser);
    },
    async okUserRoleDialog(data) {
      await userCustomService.setUserRole(data);
      const customUser = {
        dialogRoleVisible: false,
        selectRoles: [],
      };
      dispatch.customUser.setState(customUser);
    },
    async openUserAuthorityDialog(data) {
      dispatch.authority.findDataTableAndFormByName();
      const ret = await userCustomService.getUserAuthority(data.userId);
      const customUser = {
        dialogAuthorityVisible: true,
        recordId: data.userId,
        selectAuthorities: ret.data,
      };
      dispatch.customUser.setState(customUser);
    },
    async okUserAuthorityDialog(data) {
      await userCustomService.setUserAuthority(data);
      const customUser = {
        dialogAuthorityVisible: false,
        selectAuthorities: [],
      };
      dispatch.customUser.setState(customUser);
    },
  }),
};
