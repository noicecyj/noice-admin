import roleService from '@/pages/Role/services/auto/role';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'role',

  state: {
    roleTitle: '添加',
    roleTableData: [],
    roleVisible: false,
    roleFormData: {},
    roleLoadingVisible: true,
    roleTotal: 0,
    roleCurrent: 1,
    roleForm: [],
    roleTable: [],
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async rolePage(roleCurrent) {
      const dataRes = await roleService.rolePage(roleCurrent);
      const payload = {
        roleTableData: dataRes.data.content,
        roleTotal: dataRes.data.totalElements,
        roleCurrent,
        roleLoadingVisible: false,
      };
      dispatch.role.setState(payload);
    },
    roleAdd() {
      const payload = {
        roleFormData: {},
        roleTitle: '添加',
        roleVisible: true,
      };
      dispatch.role.setState(payload);
    },
    roleEdit(data) {
      const payload = {
        roleFormData: data,
        roleTitle: '编辑',
        roleVisible: true,
      };
      dispatch.role.setState(payload);
    },
    async roleDelete(roleCurrent, record) {
      const ret = await roleService.roleDelete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.rolePage(roleCurrent);
        const payload = {
          roleVisible: false,
        };
        dispatch.role.setState(payload);
      }
    },
    async roleSave(roleCurrent, formData) {
      const ret = await roleService.roleSave(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.rolePage(roleCurrent);
        const payload = {
          roleVisible: false,
        };
        dispatch.role.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        roleFormData: data,
      };
      dispatch.role.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('role');
      await this.rolePage(1);
      const payload = {
        roleTable: ret.data.dataTable,
        roleForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.role.setState(payload);
    },
  }),
};
