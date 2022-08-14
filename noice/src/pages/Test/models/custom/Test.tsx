import customServices from "@/pages/Test/services/custom/Test";
import {Message} from "@alifd/next";

export default {

  namespace: 'customTest',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    customFrom: [],
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
    startTest(data) {
      customServices.startTest(data).then((res) => {
        if (res.code === 200) {
          Message.success('开始考试成功');
        } else {
          Message.error('开始考试失败');
        }
      });
    },
  }),
};
