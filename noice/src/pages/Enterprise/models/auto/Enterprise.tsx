import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from "@/pages/Enterprise/services/auto/Enterprise";

export default {

  namespace: 'enterprise',

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
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async page(current) {
      const dataRes = await service.page(current);
      const payload = {
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current,
        loadingVisible: false,
      };
      dispatch.enterprise.setState(payload);
    },
    async save(data) {
      const ret = await service.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.enterprise.setState(payload);
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
        dispatch.enterprise.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.enterprise.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('enterprise');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.enterprise.setState(payload);
    },
    async onRowClick(data) {
      await dispatch.user.findDataTableAndFormByName(data);
      const payload = {
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.user.setState(payload);
    },
    async pageUserByEnterprise(data) {
      const dataRes = await service.pageUserByEnterprise(data.current, data.id);
      const payload = {
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
      };
      dispatch.user.setState(payload);
    },
  }),
};
