export default {

  state: {},

  reducers: {
    update(state: any, payload: any) {
      return {
        ...state,
        ...payload,
      };
    },
  },
};
