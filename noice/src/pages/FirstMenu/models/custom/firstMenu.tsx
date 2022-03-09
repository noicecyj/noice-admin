import customFirstMenuServices from '../../services/custom/firstMenu';
// import initService from '@/services/init';

export default {

  namespace: 'customFirstMenu',

  state: {
    customMethodName1: '生成菜单',
    customMethodName2: null,
    customMethodName3: null,
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: () => ({
    /**
     * 生成菜单
     */
    customMethod1() {
      customFirstMenuServices.createMenu();
    },
    customMethod2() {
    },
    customMethod3() {
    },
  }),
};
