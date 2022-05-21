import entityService from '@/pages/Entity/services/auto/entity';
import initService from '@/services/init';
import {Message} from "@alifd/next";

export default {

  namespace: 'entity',

  state: {
    entityTitle: '添加',
    entityTableData: [],
    entityVisible: false,
    entityFormData: {},
    entityLoadingVisible: true,
    entityTotal: 0,
    entityCurrent: 1,
    entityForm: [],
    entityTable: [],
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async entityPage(entityCurrent) {
      const dataRes = await entityService.entityPage(entityCurrent);
      const payload = {
        entityTableData: dataRes.data.content,
        entityTotal: dataRes.data.totalElements,
        entityCurrent,
        entityLoadingVisible: false,
      };
      dispatch.entity.setState(payload);
    },
    entityAdd() {
      const payload = {
        entityFormData: {},
        entityTitle: '添加',
        entityVisible: true,
      };
      dispatch.entity.setState(payload);
    },
    entityEdit(data) {
      const payload = {
        entityFormData: data,
        entityTitle: '编辑',
        entityVisible: true,
      };
      dispatch.entity.setState(payload);
    },
    async entityDelete(data) {
      const ret = await entityService.entityDelete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.entityPage(data.pageNumber);
        const payload = {
          entityVisible: false,
        };
        dispatch.entity.setState(payload);
      }
    },
    async entitySave(data) {
      const ret = await entityService.entitySave(data.entityFormData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.entityPage(data.pageNumber);
        const payload = {
          entityVisible: false,
        };
        dispatch.entity.setState(payload);
      }
    },
    setDataForm(data) {
      const payload = {
        entityFormData: data,
      };
      dispatch.entity.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('entity');
      await this.entityPage(1);
      const payload = {
        entityTable: ret.data.dataTable,
        entityForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.entity.setState(payload);
    },
  }),
};
