import service from '@/pages/Authority/services/auto/authority';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'authority',

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
    select:[],
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
      dispatch.authority.setState(payload);
    },
    async save(current, formData) {
      const ret = await service.save(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page(current);
        const payload = {
          visible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    async delete(current, record) {
      const ret = await service.delete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.page(current);
        const payload = {
          visible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.authority.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.authority.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.authority.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('authority');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.authority.setState(payload);
    },
    async authorityByRole(record) {
      await this.findDataTableAndFormByName();
      const ret = await service.authorityByRole(record.id);
      if (ret.code === 400) {
        Message.error('获取失败');
      } else {
        const payload = {
          divVisible: true,
          parent: record.id,
          select: ret.data,
        };
        dispatch.role.setState(payload);
      }
    },
    async authoritySaveRole(id, data) {
      const ret = await service.authoritySaveRole(id, data);
      if (ret.code === 400) {
        Message.error('保存失败');
      } else {
        Message.success('保存成功');
        const payload = {
          divVisible: false,
        };
        dispatch.role.setState(payload);
      }
    },
  }),
};
