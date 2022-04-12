export default {

  namespace: 'customBpmn',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    customFrom: [],
    dialogBpmnVisible: false,
    bpmnXml: '',
    recordId: '',
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: () => ({
    customMethod1() {
    },
    customMethod2() {
    },
    customMethod3() {
    },
    okBpmnDialog(data) {

    }
  }),
};
