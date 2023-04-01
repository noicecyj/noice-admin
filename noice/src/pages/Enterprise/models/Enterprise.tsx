import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'Enterprise',

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
    searchForm: {},
    searchDefaultForm: {},
    subData: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async page(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/userApi/pageEnterprise',
        obj: {
          po: data.searchForm,
          pageNumber: data.current,
          pageSize: 10,
        }
      });
      const payload = {
        searchForm: data.searchForm,
        tableData: dataRes.data.records,
        total: dataRes.data.total,
        current: data.current,
        loadingVisible: false,
      };
      dispatch.Enterprise.setState(payload);
    },
    async save(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/userApi/saveEnterprise',
        obj: {
          po: data.formData,
          user: data.user,
        }
      });
      if (dataRes.code === 400) {
        Message.error(dataRes.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page({
          searchForm: data.searchForm,
          current: data.current,
        });
        const payload = {
          visible: false,
        };
        dispatch.Enterprise.setState(payload);
      }
    },
    async remove(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/userApi/deleteEnterprise',
        obj: {
          po: data.record,
        }
      });
      if (dataRes.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.page({
          searchForm: data.searchForm,
          current: data.current,
        });
        const payload = {
          visible: false,
        };
        dispatch.Enterprise.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.Enterprise.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.Enterprise.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.Enterprise.setState(payload);
    },
    setSearchDataForm(data) {
      const payload = {
        searchForm: data,
      };
      dispatch.Enterprise.setState(payload);
    },
    async findDataTableAndFormByName(param) {
      const ret = await initService.findDataTableAndFormByName('enterprise');
      let searchParam = {...ret.data.dataTable.INFO, ...param}
      await this.page({
        searchForm: searchParam,
        current: 1,
      });
      const payload = {
        searchDefaultForm: searchParam,
        titleConfig: ret.data.dataTable.TITLE,
        tableOperation: ret.data.dataTable.OPERATION,
        tableConfig: ret.data.dataTable.CONFIG,
        tableSearch: ret.data.dataTable.SEARCH,
        formConfig: ret.data.dataForm.CONFIG,
        subData: ret.data.subData,
      };
      dispatch.Enterprise.setState(payload);
    },
    runCustomMethod(data) {
      initService.runCustomMethod(data).then((res) => {
        if (res.code === 200) {
          Message.success('执行成功');
        } else {
          Message.error('执行失败');
        }
      });
    },
  }),
};
