export default {

  namespace: 'customAppService',

  state: {},

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({}),
};
