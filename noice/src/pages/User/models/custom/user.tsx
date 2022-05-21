import userCustomService from '@/pages/User/services/custom/user';
import {Message} from '@alifd/next';

export default {

  namespace: 'customUser',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    customFrom: [],
    recordId: '',
    dialogPasswordVisible: false,
    passwordFormData: {},
    passwordForm: [
      {
        id: '1',
        propertyMode: 'Password',
        propertyRequired: true,
        propertyEditEnable: true,
        propertyDefaultValue: '',
        propertyLabel: '新密码',
        propertyCode: 'new_password',
        propertyName: 'newPassword',
      },
      {
        id: '2',
        propertyMode: 'Password',
        propertyRequired: true,
        propertyEditEnable: true,
        propertyDefaultValue: '',
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
          dialogPasswordVisible: false,
          passwordFormData: {},
        };
        dispatch.customUser.setState(customUser);
      });
    },
  }),
};
