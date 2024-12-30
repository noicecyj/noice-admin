export default {

  state: {
    name: '实体表格',
    code: 'PersistentTable',
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
