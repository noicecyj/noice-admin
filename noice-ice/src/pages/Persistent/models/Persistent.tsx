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
    async page(params: any, sort: any, filter: any, data: any) {
      console.log(sort);
      const dataRes = await initService.http({
        // url: data.pageUrl,
        url: '/entityCreateApi/Persistent/page',
        obj: params,
      });
      return {
        data: dataRes.data.records,
        // success 请返回 true，
        // 不然 table 会停止解析数据，即使有数据
        success: dataRes.code == 200,
        total: dataRes.data.total,
      };
    },

    // async save(data: {
    //     formData: any;
    //     user: any;
    //     searchForm: any;
    //     moreSearchForm: any;
    //     current: any;
    //     saveUrl: any;
    //     pageUrl: any;
    // }) {
    //     const dataRes = await initService.http({
    //         url: data.saveUrl,
    //         obj: {
    //             po: data.formData,
    //             user: data.user,
    //         }
    //     });
    //     if (dataRes.code === 400) {
    //         alert(dataRes.data.defaultMessage);
    //     } else {
    //         alert('保存成功');
    //         const payload = {
    //             visible: false,
    //         };
    //         dispatch.Entity.setState(payload);
    //     }
    // },
    // async remove(data: {
    //     record: string;
    //     searchForm: any;
    //     moreSearchForm: any;
    //     current: any;
    //     deleteUrl: any;
    //     pageUrl: any;
    // }) {
    //     const dataRes = await initService.http({
    //         url: data.deleteUrl + data.record,
    //         method: 'get'
    //     });
    //     if (dataRes.code === 400) {
    //         alert('删除失败');
    //     } else {
    //         alert('删除成功');
    //         const payload = {
    //             visible: false,
    //         };
    //         dispatch.Entity.setState(payload);
    //     }
    // },
    // add() {
    //     const payload = {
    //         formData: {},
    //         title: '添加',
    //         visible: true,
    //     };
    //     dispatch.Entity.setState(payload);
    // },
    // edit(data: any) {
    //     const payload = {
    //         formData: data,
    //         title: '编辑',
    //         visible: true,
    //     };
    //     dispatch.Entity.setState(payload);
    // },
    // setDataForm(data: any) {
    //     const payload = {
    //         formData: data,
    //     };
    //     dispatch.Entity.setState(payload);
    // },
    // setSearchDataForm(data: any) {
    //     const payload = {
    //         searchForm: data,
    //     };
    //     dispatch.Entity.setState(payload);
    // },
    // setMoreSearchDataForm(data: any) {
    //     const payload = {
    //         moreSearchForm: data,
    //     };
    //     dispatch.Entity.setState(payload);
    // },
    // async findDataTableAndFormByName(param: any) {
    //     const payload = {
    //         tableConfig: param.table.childPersistentTableConfigVoList,
    //         tableSearch: param.table.childPersistentTableSearchConfigVoList,
    //         urlMap: param.urlMap,
    //     };
    //     dispatch.Entity.setState(payload);
    //     // await this.page({
    //     //     searchForm: {
    //     //         status: true
    //     //     },
    //     //     moreSearchForm: {},
    //     //     current: 1,
    //     //     pageUrl: param.urlMap["page"].interfacePath,
    //     // });
    // },
  }),
};
