export default {

  namespace: 'user',

  state: {
    username: '',
    token: '',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

};
