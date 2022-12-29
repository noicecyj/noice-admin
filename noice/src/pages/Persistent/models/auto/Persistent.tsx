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
    form: [],
    table: [],
    customData: {},
    divVisible: false,
    parent: "",
    select: [],
    searchForm: {},
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
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
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
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('persistent');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.persistent.setState(payload);
    },
  }),
};
