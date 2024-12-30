export default {

  state: {
    name: '实体表格配置',
    code: 'PersistentTableConfig',
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
