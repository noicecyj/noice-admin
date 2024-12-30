export default {

  state: {
    name: '实体',
    code: 'Persistent',
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
