import customServices from '../../services/custom/Persistent';
import {Message} from '@alifd/next';

export default {

  namespace: 'persistentCustom',

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
    createEntityFile(data) {
      customServices.createEntityFile(data).then((res) => {
        if (res.code === 200) {
          Message.success('生成成功');
        } else {
          Message.error('生成失败');
        }
      });
    },
    deleteEntityFile(data) {
      customServices.deleteEntityFile(data).then((res) => {
        if (res.code === 200) {
          Message.success('删除成功');
        } else {
          Message.error('删除失败');
        }
      });
    },
  }),
};
