export default {

  state: {
    name: '实体表单',
    code: 'PersistentForm',
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
