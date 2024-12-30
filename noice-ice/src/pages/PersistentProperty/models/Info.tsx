export default {

  state: {
    name: '实体属性',
    code: 'PersistentProperty',
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
