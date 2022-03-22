import roleCustomService from "@/pages/Role/services/custom/role";
import {Message} from "@alifd/next";

export default {

  namespace: 'customRole',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    recordId: '',
    dialogAuthorityVisible: false,
    visibleAuthorityLoading: false,
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
    async openRoleAuthorityDialog(data) {
      dispatch.authority.findDataTableAndFormByName();
      const ret = await roleCustomService.getRoleAuthority(data.roleId);
      const customRole = {
        dialogAuthorityVisible: true,
        recordId: data.roleId,
        selectAuthorities: ret.data,
      };
      dispatch.customRole.setState(customRole);
    },
    async okRoleAuthorityDialog(data) {
      const ret = await roleCustomService.setRoleAuthority(data);
      if (ret.code === 200) {
        Message.success('分配成功');
      } else {
        Message.error('分配失败');
      }
      const customRole = {
        dialogAuthorityVisible: false,
        selectAuthorities: [],
      };
      dispatch.customRole.setState(customRole);
    },
  }),
};
