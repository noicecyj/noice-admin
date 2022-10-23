import customServices from "@/pages/Test/services/custom/Test";
import {Message} from "@alifd/next";

export default {

  namespace: 'customTest',

  state: {
    customMethodName1: null,
    customMethodName2: null,
    customMethodName3: null,
    customFrom: [],
    divVisible: false,
    questionList: [],
    answerList: [],
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
    startTest(test) {
      customServices.startTest(test).then((res) => {
        if (res.code === 200) {
          console.log(res.data)
          const payload = {
            divVisible: true,
            questionList: res.data,
          };
          dispatch.testCustom.setState(payload);
          Message.success('开始考试成功');
        } else {
          Message.error('开始考试失败');
        }
      });
    },
  }),
};
