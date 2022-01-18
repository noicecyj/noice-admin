import customDictionaryServices from '../../services/custom/dictionary';
import initService from '@/services/init';

export default {

  namespace: 'customDictionary',

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
