import userCustomService from '@/pages/User/services/custom/user';
import {Message} from '@alifd/next';

export default {

  namespace: 'customUser',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    recordId: '',
    dialogPasswordVisible: false,
    passwordFormData: {},
    passwordForm: [
      {
        id: '1',
        propertyMode: 'Password',
        propertyRequired: '是',
        propertyLabel: '新密码',
        propertyCode: 'new_password',
        propertyName: 'newPassword',
      },
      {
        id: '2',
        propertyMode: 'Password',
        propertyRequired: '是',
        propertyLabel: '确认密码',
        propertyCode: 'check_password',
        propertyName: 'checkPassword',
      },
    ],
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
    setDataForm(data) {
      const payload = {
        passwordFormData: data,
      };
      dispatch.customUser.setState(payload);
    },
    async resetPassword(data) {
      userCustomService.resetPassword(data).then((res) => {
        if (res.code === 200) {
          Message.success('重置成功');
        } else {
          Message.error('重置失败');
        }
        const customUser = {
          recordId: '',
          dialogPasswordVisible: false,
          passwordFormData: {},
        };
        dispatch.customUser.setState(customUser);
      });
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
      const ret = await userCustomService.setUserRole(data);
      if (ret.code === 200) {
        Message.success('分配成功');
      } else {
        Message.error('分配失败');
      }
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
      const ret = await userCustomService.setUserAuthority(data);
      if (ret.code === 200) {
        Message.success('分配成功');
      } else {
        Message.error('分配失败');
      }
      const customUser = {
        dialogAuthorityVisible: false,
        selectAuthorities: [],
      };
      dispatch.customUser.setState(customUser);
    },
  }),
};
