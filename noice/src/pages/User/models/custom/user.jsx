import customUserServices from '../../services/custom/user';
import initService from '@/services/init';

export default {

  namespace: 'customUser',

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
