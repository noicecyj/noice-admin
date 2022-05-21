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
    async propertyPage(data) {
      const dataRes = await propertyService.propertyPage(data.propertyCurrent, data.entity);
      const payload = {
        propertyTableData: dataRes.data.content,
        propertyTotal: dataRes.data.totalElements,
        propertyCurrent: data.propertyCurrent,
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
    async propertyDelete(data) {
      console.log('data=====>', data)
      const ret = await propertyService.propertyDelete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.propertyPage({propertyCurrent: data.pageNumber, entity: data.entity});
        const payload = {
          propertyVisible: false,
        };
        dispatch.property.setState(payload);
      }
    },
    async propertySave(data) {
      const ret = await propertyService.propertySave({...data.propertyFormData, entity: data.entity});
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.propertyPage({propertyCurrent: data.pageNumber, entity: data.entity});
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
      await this.propertyPage({propertyCurrent: 1, entity});
      const payload = {
        propertyTable: ret.data.dataTable,
        propertyForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.property.setState(payload);
    },
    async onRowClick(data) {
      await this.findDataTableAndFormByName(data.record);
      const payload = {
        divVisible: data.selected,
        entity: data.record,
        propertyVisible: false,
      };
      dispatch.property.setState(payload);
    },
  }),
};
