import customAuthorityServices from '../../services/custom/authority';

export default {

  namespace: 'customAuthority',

  state: {
    customMethodName1: '生成权限',
    customMethodName2: null,
    customMethodName3: null,
    customFrom: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: () => ({
    customMethod1() {
      customAuthorityServices.createAuthority();
    },
    customMethod2() {
    },
    customMethod3() {
    },
  }),
};
