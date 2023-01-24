import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/Persistent/services/auto/Persistent';

export default {

  namespace: 'persistent',

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
    customData: {},
    divVisible: false,
    parent: "",
    select: [],
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
      const dataRes = await service.page(data.searchForm, data.current, 10);
      const payload = {
        searchForm: data.searchForm,
        tableData: dataRes.data.records,
        total: dataRes.data.total,
        current: data.current,
        loadingVisible: false,
      };
      dispatch.persistent.setState(payload);
    },
    async save(data) {
      const ret = await service.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page(data);
        const payload = {
          visible: false,
        };
        dispatch.persistent.setState(payload);
      }
    },
    async delete(data) {
      const ret = await service.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.persistent.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.persistent.setState(payload);
    },
    edit(data) {
      console.log("edit====>",data)
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.persistent.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.persistent.setState(payload);
    },
    setSearchDataForm(data) {
      const payload = {
        searchForm: data,
      };
      dispatch.persistent.setState(payload);
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
      dispatch.persistent.setState(payload);
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
