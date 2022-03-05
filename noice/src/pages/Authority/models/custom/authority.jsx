import customAuthorityServices from '../../services/custom/authority';
import initService from '@/services/init';

export default {

  namespace: 'customAuthority',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    customMethod1() { },
    customMethod2() { },
    customMethod3() { },
  }),
};
