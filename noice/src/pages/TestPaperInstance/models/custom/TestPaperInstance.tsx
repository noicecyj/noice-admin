import customServices from "@/pages/TestPaperInstance/services/custom/TestPaperInstance";
import {Message} from "@alifd/next";

export default {

  namespace: 'customTestPaperInstance',

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
    createTestPaperInstance(data) {
      customServices.createTestPaperInstance(data).then((res) => {
        if (res.code === 200) {
          Message.success('生成成功');
        } else {
          Message.error('生成失败');
        }
      });
    },
  }),
};
