import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/Role/services/auto/Role';

export default {

  namespace: 'role',

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
      dispatch.role.setState(payload);
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
        dispatch.role.setState(payload);
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
        dispatch.role.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.role.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.role.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.role.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('role');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
      };
      dispatch.role.setState(payload);
    },
    async authorityByRole(data) {
      await dispatch.authority.findDataTableAndFormByName();
      const ret = await service.authorityByRole(data.id);
      if (ret.code === 400) {
        Message.error('获取失败');
      } else {
        const payload = {
          divVisible: true,
          parent: data.id,
          select: ret.data,
        };
        dispatch.authority.setState(payload);
      }
    },
    async authoritySaveRole(data) {
      const ret = await service.authoritySaveRole(data.parent, data.select);
      if (ret.code === 400) {
        Message.error('保存失败');
      } else {
        Message.success('保存成功');
        const payload = {
          divVisible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
  }),
};
