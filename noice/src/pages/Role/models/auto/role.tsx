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
    userId: '',
    dialogUserRoleVisible: false,
    visibleUserRoleLoading: false,
    selectUserRoles: [],
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
        roleTableData: dataRes.data.results,
        roleTotal: dataRes.data.total,
        roleCurrent,
        roleLoadingVisible: false,
      };
      dispatch.role.setState(payload);
    },
    async roleAdd() {
      const payload = {
        roleFormData: {},
        roleTitle: '添加',
        roleVisible: true,
      };
      dispatch.role.setState(payload);
    },
    async roleEdit(data) {
      const role = await roleService.findRoleById(data.id);
      const fromData = {
        ...role.data,
      };
      const payload = {
        roleFormData: fromData,
        roleTitle: '编辑',
        roleVisible: true,
      };
      dispatch.role.setState(payload);
    },
    async roleDelete(data) {
      await roleService.roleDelete(data.record.id);
      await this.rolePage(data.data.pageNumber);
      const payload = {
        roleVisible: false,
      };
      dispatch.role.setState(payload);
    },
    async roleSave(data) {
      await roleService.roleSave(data.roleFormData);
      await this.rolePage(data.pageNumber);
      const payload = {
        roleVisible: false,
      };
      dispatch.role.setState(payload);
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
    async openUserRoleDialog(data) {
      await this.findDataTableAndFormByName();
      const ret = await roleService.getUserRole(data.userId);
      const payload = {
        userId: data.userId,
        dialogUserRoleVisible: true,
        selectUserRoles: ret.data,
      };
      dispatch.role.setState(payload);
    },
    async okUserRoleDialog(data) {
      const ret = await roleService.setUserRole(data);
      if (ret.code === 200) {
        Message.success('分配成功');
      } else {
        Message.error('分配失败');
      }
      const payload = {
        dialogUserRoleVisible: false,
        selectUserRoles: [],
      };
      dispatch.role.setState(payload);
    },
  }),
};
