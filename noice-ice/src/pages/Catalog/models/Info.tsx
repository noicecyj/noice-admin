export default {

  state: {
    name: '目录',
    code: 'Catalog',
  },

  reducers: {
    update(state: any, payload: any) {
      return {
        ...state,
        ...payload,
      };
    },
  },
};
