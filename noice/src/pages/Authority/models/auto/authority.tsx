import authorityService from '@/pages/Authority/services/auto/authority';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'authority',

  state: {
    authorityTitle: '添加',
    authorityTableData: [],
    authorityVisible: false,
    authorityFormData: {},
    authorityLoadingVisible: true,
    authorityTotal: 0,
    authorityCurrent: 1,
    authorityForm: [],
    authorityTable: [],
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async authorityPage(authorityCurrent) {
      const dataRes = await authorityService.authorityPage(authorityCurrent);
      const payload = {
        authorityTableData: dataRes.data.content,
        authorityTotal: dataRes.data.totalElements,
        authorityCurrent,
        authorityLoadingVisible: false,
      };
      dispatch.authority.setState(payload);
    },
    authorityAdd() {
      const payload = {
        authorityFormData: {},
        authorityTitle: '添加',
        authorityVisible: true,
      };
      dispatch.authority.setState(payload);
    },
    authorityEdit(data) {
      const payload = {
        authorityFormData: data,
        authorityTitle: '编辑',
        authorityVisible: true,
      };
      dispatch.authority.setState(payload);
    },
    async authorityDelete(authorityCurrent, record) {
      const ret = await authorityService.authorityDelete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.authorityPage(authorityCurrent);
        const payload = {
          authorityVisible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    async authoritySave(authorityCurrent, formData) {
      const ret = await authorityService.authoritySave(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.authorityPage(authorityCurrent);
        const payload = {
          authorityVisible: false,
        };
        dispatch.authority.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        authorityFormData: data,
      };
      dispatch.authority.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('authority');
      await this.authorityPage(1);
      const payload = {
        authorityTable: ret.data.dataTable,
        authorityForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.authority.setState(payload);
    },
  }),
};
