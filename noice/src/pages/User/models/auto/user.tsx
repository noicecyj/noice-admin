import userService from '@/pages/User/services/auto/user';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'user',

  state: {
    userTitle: '添加',
    userTableData: [],
    userVisible: false,
    userFormData: {},
    userLoadingVisible: true,
    userTotal: 0,
    userCurrent: 1,
    userForm: [],
    userTable: [],
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async userPage(userCurrent) {
      const dataRes = await userService.userPage(userCurrent);
      const payload = {
        userTableData: dataRes.data.content,
        userTotal: dataRes.data.totalElements,
        userCurrent,
        userLoadingVisible: false,
      };
      dispatch.user.setState(payload);
    },
    userAdd() {
      const payload = {
        userFormData: {},
        userTitle: '添加',
        userVisible: true,
      };
      dispatch.user.setState(payload);
    },
    userEdit(data) {
      const payload = {
        userFormData: data,
        userTitle: '编辑',
        userVisible: true,
      };
      dispatch.user.setState(payload);
    },
    async userDelete(userCurrent, record) {
      const ret = await userService.userDelete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.userPage(userCurrent);
        const payload = {
          userVisible: false,
        };
        dispatch.user.setState(payload);
      }
    },
    async userSave(userCurrent, formData) {
      const ret = await userService.userSave(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.userPage(userCurrent);
        const payload = {
          userVisible: false,
        };
        dispatch.user.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        userFormData: data,
      };
      dispatch.user.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('user');
      await this.userPage(1);
      const payload = {
        userTable: ret.data.dataTable,
        userForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.user.setState(payload);
    },
  }),
};
