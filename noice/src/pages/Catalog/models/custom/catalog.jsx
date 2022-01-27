import customCatalogServices from '../../services/custom/catalog';
import initService from '@/services/init';

export default {

  namespace: 'customCatalog',

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
