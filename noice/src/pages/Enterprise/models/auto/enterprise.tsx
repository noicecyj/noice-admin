import enterpriseService from '@/pages/Enterprise/services/auto/enterprise';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'enterprise',

  state: {
    enterpriseTitle: '添加',
    enterpriseTableData: [],
    enterpriseVisible: false,
    enterpriseFormData: {},
    enterpriseLoadingVisible: true,
    enterpriseTotal: 0,
    enterpriseCurrent: 1,
    enterpriseForm: [],
    enterpriseTable: [],
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async enterprisePage(enterpriseCurrent) {
      const dataRes = await enterpriseService.enterprisePage(enterpriseCurrent);
      const payload = {
        enterpriseTableData: dataRes.data.content,
        enterpriseTotal: dataRes.data.totalElements,
        enterpriseCurrent,
        enterpriseLoadingVisible: false,
      };
      dispatch.enterprise.setState(payload);
    },
    enterpriseAdd() {
      const payload = {
        enterpriseFormData: {},
        enterpriseTitle: '添加',
        enterpriseVisible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    enterpriseEdit(data) {
      const payload = {
        enterpriseFormData: data,
        enterpriseTitle: '编辑',
        enterpriseVisible: true,
      };
      dispatch.enterprise.setState(payload);
    },
    async enterpriseDelete(enterpriseCurrent, record) {
      const ret = await enterpriseService.enterpriseDelete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.enterprisePage(enterpriseCurrent);
        const payload = {
          enterpriseVisible: false,
        };
        dispatch.enterprise.setState(payload);
      }
    },
    async enterpriseSave(enterpriseCurrent, formData) {
      const ret = await enterpriseService.enterpriseSave(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.enterprisePage(enterpriseCurrent);
        const payload = {
          enterpriseVisible: false,
        };
        dispatch.enterprise.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        enterpriseFormData: data,
      };
      dispatch.enterprise.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('enterprise');
      await this.enterprisePage(1);
      const payload = {
        enterpriseTable: ret.data.dataTable,
        enterpriseForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.enterprise.setState(payload);
    },
  }),
};
