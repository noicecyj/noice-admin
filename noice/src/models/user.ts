export default {

  namespace: 'user',

  state: {
    username: '',
    token: '',
  },

  reducers: {
    setState(prevState, payload) {
      console.log(payload);
      return {...prevState, ...payload};
    },
  },

};
