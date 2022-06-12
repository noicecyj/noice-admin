import propertyService from '@/pages/Entity/services/auto/property';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'property',

  state: {
    propertyTitle: '添加',
    propertyTableData: [],
    propertyFormData: {},
    propertyLoadingVisible: true,
    propertyTotal: 0,
    propertyCurrent: 1,
    propertyForm: [],
    propertyTable: [],
    propertyVisible: false,
    divVisible: false,
    entity: {},
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async propertyPage(propertyCurrent, entity) {
      const dataRes = await propertyService.propertyPage(propertyCurrent, entity);
      const payload = {
        propertyTableData: dataRes.data.content,
        propertyTotal: dataRes.data.totalElements,
        propertyCurrent,
        propertyLoadingVisible: false,
      };
      dispatch.property.setState(payload);
    },
    propertyAdd() {
      const payload = {
        propertyFormData: {},
        propertyTitle: '添加',
        propertyVisible: true,
      };
      dispatch.property.setState(payload);
    },
    propertyEdit(data) {
      const payload = {
        propertyFormData: data,
        propertyTitle: '编辑',
        propertyVisible: true,
      };
      dispatch.property.setState(payload);
    },
    async propertyDelete(propertyCurrent, entity, record) {
      const ret = await propertyService.propertyDelete(record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.propertyPage(propertyCurrent, entity);
        const payload = {
          propertyVisible: false,
        };
        dispatch.property.setState(payload);
      }
    },
    async propertySave(propertyCurrent, entity, formData) {
      const ret = await propertyService.propertySave(formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.propertyPage(propertyCurrent, entity);
        const payload = {
          propertyVisible: false,
        };
        dispatch.property.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        propertyFormData: data,
      };
      dispatch.property.setState(payload);
    },
    async findDataTableAndFormByName(entity) {
      const ret = await initService.findDataTableAndFormByName('property');
      await this.propertyPage(1, entity);
      const payload = {
        propertyTable: ret.data.dataTable,
        propertyForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.property.setState(payload);
    },
  }),
};
