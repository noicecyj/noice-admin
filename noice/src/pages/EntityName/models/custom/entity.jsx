import customEntityServices from '../../services/custom/entity';

export default {

  namespace: 'customEntity',

  state: {},

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
  }),
};
