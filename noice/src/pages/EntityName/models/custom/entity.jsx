import customEntityServices from '../../services/custom/entity';

export default {

  namespace: 'customEntity',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    customMethod1() { },
    customMethod2() { },
    customMethod3() { },
  }),
};
