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
    customMethod1() {},
    customMethod2() {},
    customMethod3() {},
  }),
};
