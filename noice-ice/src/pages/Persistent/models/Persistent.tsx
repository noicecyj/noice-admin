import initService from '@/services/init';

export default {

  namespace: 'Persistent',

  state: {
    title: '添加',
    tableData: [],
    visible: false,
    formData: {},
    loadingVisible: true,
    total: 0,
    current: 1,
    formConfig: [],
    tableOperation: [],
    tableConfig: [],
    titleConfig: [],
    tableSearch: [],
    urlMap: {},
    searchForm: {},
    moreSearchForm: {},
    searchDefaultForm: {},
    subData: [],
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
