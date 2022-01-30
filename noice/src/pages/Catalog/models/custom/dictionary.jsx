export default {

  namespace: 'customDictionary',

  state: {},

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({}),
};
