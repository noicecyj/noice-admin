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
    formData: {} as PersistentItem,
  },

  reducers: {
    setState(prevState: any, payload: any) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch: any) => ({
    //自定义方法
  }),
};
