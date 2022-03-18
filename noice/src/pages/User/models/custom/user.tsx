export default {

  namespace: 'customUser',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    dialogVisible: false,
    recordId: '',
    visibleLoading: false,
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    customMethod1() {
    },
    customMethod2() {
    },
    customMethod3() {
    },
    async openDialog(data) {
      dispatch.role.findDataTableAndFormByName();
      const customUser = {
        dialogVisible: true,
        recordId: data.id,
      };
      dispatch.customUser.setState(customUser);
    }
  }),
};
