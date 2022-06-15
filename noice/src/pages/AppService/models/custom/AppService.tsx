import customAppServiceServices from '../../services/custom/AppService'
import {Message} from "@alifd/next";

export default {

  namespace: 'customAppService',

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
    createAppFile(data) {
      customAppServiceServices.createAppFile(data).then((res) => {
        if (res.code === 200) {
          Message.success('生成成功');
        } else {
          Message.error('生成失败');
        }
      });
    },
  }),
};
