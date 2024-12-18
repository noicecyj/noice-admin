interface PersistentItem {
  appServiceId: string;
  persistentCode: string;
  persistentId: string;
  persistentName: string;
  persistentType: string;
}

export default {

  namespace: 'Persistent',

  state: {
    appServiceId: '',
    persistentCode: '',
    persistentId: '',
    persistentName: '',
    persistentType: '',
  } as PersistentItem,

  reducers: {
    update(state: any, payload: any) {
      return {
        ...state,
        ...payload,
      };
    },
  },
};
