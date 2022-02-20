import customFirstMenuServices from '../../services/custom/firstMenu';
import initService from '@/services/init';

export default {

  namespace: 'customFirstMenu',

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
