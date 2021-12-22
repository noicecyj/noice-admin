import entityService from '@/pages/EntityName/services/auto/entity';
import initService from '@/services/init';

export default {

  namespace: 'entity',

  state: {
    entityTableData: [],
    entityVisible: false,
    entityFormData: {},
    entityLoadingVisible: true,
    entityTotal: 0,
    entityCurrent: 1,
    entityFormItem: [],
    entityForm: [],
    entityTable: [],
    divVisible: false,
    entityNameId: '',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async entityPage(entityCurrent, pid) {
      const dataRes = await entityService.entityPage(entityCurrent, pid);
      const payload = {
        entityTotal: dataRes.data.totalElements,
        entityCurrent,
        entityLoadingVisible: false,
      };
      dispatch.entity.setState(payload);
    },
    async entityEdit(data) {
      if (data) {
        const entity = await entityService.findEntityById(data.id);
        const fromData = {
          ...entity.data,
        };
        const payload = {
          entityFormData: fromData,
          entityVisible: true,
        };
        dispatch.entity.setState(payload);
      } else {
        const payload = {
          entityFormData: {},
          entityVisible: true,
        };
        dispatch.entity.setState(payload);
      }
    },
    async entityDelete(data) {
      await entityService.entityDelete(data.record);
      await this.entityPage(data.entityCurrent, data.pid);
      const payload = {
        entityVisible: false,
      };
      dispatch.entity.setState(payload);
    },
    async entitySave(data) {
      await entityService.entitySave(data.entityFormData);
      await this.entityPage(data.entityCurrent, data.pid);
      const payload = {
        entityVisible: false,
      };
      dispatch.entity.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        entityFormData: data,
      };
      dispatch.entity.setState(payload);
    },
    async findDataTableAndFormByName(pid) {
      const data = await initService.findDataTableAndFormByName('entity');
      await this.entityPage(1, pid);
      const payload = {
        entityTable: data.dataTable,
        entityForm: data.dataForm,
      };
      dispatch.entity.setState(payload);
    },
    async onRowClick(selected, record) {
      await this.findDataTableAndFormByName(record.id);
      await this.entityPage(1, record.id);
      const payload = {
        divVisible: selected,
        entityNameId: record.id,
        entityVisible: false,
      };
      dispatch.entity.setState(payload);
    },
  }),
};
