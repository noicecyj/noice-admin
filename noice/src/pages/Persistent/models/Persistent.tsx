import initService from '@/services/init';
import {Message} from "@alifd/next";

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
    searchForm: {},
    searchDefaultForm: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async page(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/entityCreateApi/pagePersistent',
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
      dispatch.Persistent.setState(payload);
    },
    async save(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/entityCreateApi/savePersistent',
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
        dispatch.Persistent.setState(payload);
      }
    },
    async remove(data) {
      const dataRes = await initService.runCustomMethod({
        url: '/entityCreateApi/deletePersistent',
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
        dispatch.Persistent.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.Persistent.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.Persistent.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.Persistent.setState(payload);
    },
    setSearchDataForm(data) {
      const payload = {
        searchForm: data,
      };
      dispatch.Persistent.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('persistent');
      await this.page({
        searchForm: ret.data.dataTable.INFO,
        current: 1,
      });
      const payload = {
        searchDefaultForm: ret.data.dataTable.INFO,
        titleConfig: ret.data.dataTable.TITLE,
        tableOperation: ret.data.dataTable.OPERATION,
        tableConfig: ret.data.dataTable.CONFIG,
        tableSearch: ret.data.dataTable.SEARCH,
        formConfig: ret.data.dataForm.CONFIG,
      };
      dispatch.Persistent.setState(payload);
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
