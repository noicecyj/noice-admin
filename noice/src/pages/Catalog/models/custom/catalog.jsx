import customcatalogServices from '../../services/custom/Catalog';
import initService from '@/services/init';

export default {

  namespace: 'customcatalog',

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
