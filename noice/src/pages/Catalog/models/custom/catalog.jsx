export default {

  namespace: 'customCatalog',

  state: {},

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({}),
};
