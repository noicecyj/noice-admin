export default {

  state: {
    name: '实体表单配置',
    code: 'PersistentFormConfig',
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
