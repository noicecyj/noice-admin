import customRoleServices from '../../services/custom/role';
import initService from '@/services/init';

export default {

  namespace: 'customRole',

  state: {

  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({

  }),
};
