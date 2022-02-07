import customSqlServices from '../../services/custom/sql';
import initService from '@/services/init';

export default {

  namespace: 'customSql',

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
