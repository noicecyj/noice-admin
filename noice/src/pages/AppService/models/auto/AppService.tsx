import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/AppService/services/auto/AppService';
import authorityService from '@/pages/Authority/services/auto/Authority'
import persistentService from '@/pages/Persistent/services/Persistent'

export default {

  namespace: 'appService',

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
      dispatch.appService.setState(payload);
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
        dispatch.appService.setState(payload);
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
        dispatch.appService.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.appService.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.appService.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.appService.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('app_service');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
      };
      dispatch.appService.setState(payload);
    },
    async pageAuthorityByAppService(data) {
      const ret = await initService.findDataTableAndFormByName('authority');
      const dataRes = await service.pageAuthorityByAppService(data.current, data.id);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.authority.setState(payload);
    },
    async saveAuthorityByAppService(data) {
      const ret = await authorityService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pageAuthorityByAppService({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    async deleteAuthorityByAppService(data) {
      const ret = await authorityService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pageAuthorityByAppService({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    async pagePersistentByAppService(data) {
      const ret = await initService.findDataTableAndFormByName('persistent');
      const dataRes = await service.pagePersistentByAppService(data.current, data.id);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.persistent.setState(payload);
    },
    async savePersistentByAppService(data) {
      const ret = await persistentService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pagePersistentByAppService({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.persistent.setState(payload);
      }
    },
    async deletePersistentByAppService(data) {
      const ret = await persistentService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pagePersistentByAppService({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.persistent.setState(payload);
      }
    },
  }),
};
