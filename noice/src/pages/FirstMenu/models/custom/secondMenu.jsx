import customSecondMenuServices from '../../services/custom/secondMenu';
import initService from '@/services/init';

export default {

  namespace: 'customSecondMenu',

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
