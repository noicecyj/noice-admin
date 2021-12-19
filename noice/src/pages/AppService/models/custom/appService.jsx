export default {

  namespace: 'appService',

  state: {
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },
};
