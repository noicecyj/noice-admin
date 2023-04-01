import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'PersistentForm',

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
        url: '/entityCreateApi/pagePersistentForm',
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
      dispatch.PersistentForm.setState(payload);
    },
    async save(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/entityCreateApi/savePersistentForm',
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
        dispatch.PersistentForm.setState(payload);
      }
    },
    async remove(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/entityCreateApi/deletePersistentForm',
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
        dispatch.PersistentForm.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.PersistentForm.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.PersistentForm.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.PersistentForm.setState(payload);
    },
    setSearchDataForm(data) {
      const payload = {
        searchForm: data,
      };
      dispatch.PersistentForm.setState(payload);
    },
    async findDataTableAndFormByName(param) {
      const ret = await initService.findDataTableAndFormByName('persistent_form');
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
      dispatch.PersistentForm.setState(payload);
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
