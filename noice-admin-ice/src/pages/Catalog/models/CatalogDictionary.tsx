export default {

  state: {
    name: '目录字典',
    code: 'CatalogDictionary',
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
