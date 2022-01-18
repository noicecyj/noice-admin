import customAppServiceServices from '../../services/custom/appService';
import initService from '@/services/init';

export default {

  namespace: 'customAppService',

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
