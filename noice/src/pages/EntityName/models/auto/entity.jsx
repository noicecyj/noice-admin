import entityService from '@/pages/EntityName/services/auto/entity';
import initService from '@/services/init';

export default {

  namespace: 'entity',

  state: {
    entityTableData: [],
    entityFormData: {},
    entityLoadingVisible: true,
    entityTotal: 0,
    entityCurrent: 1,
    entityForm: [],
    entityTable: [],
    entityVisible: false,
    divVisible: false,
    entityNameId: '',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async entityPage(data) {
      const dataRes = await entityService.entityPage(data.entityCurrent, data.pid);
      const payload = {
        entityTableData: dataRes.data.results,
        entityTotal: dataRes.data.total,
        entityCurrent: data.entityCurrent,
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
      await entityService.entityDelete(data.record.id);
      await this.entityPage({ entityCurrent: data.data.pageNumber, pid: data.data.pid });
      const payload = {
        entityVisible: false,
      };
      dispatch.entity.setState(payload);
    },
    async entitySave(data) {
      await entityService.entitySave({ ...data.entityFormData, pid: data.pid });
      await this.entityPage({ entityCurrent: data.pageNumber, pid: data.pid });
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
      const ret = await initService.findDataTableAndFormByName('entity');
      await this.entityPage({ entityCurrent: 1, pid });
      const payload = {
        entityTable: ret.data.dataTable,
        entityForm: ret.data.dataForm,
      };
      dispatch.entity.setState(payload);
    },
    async onRowClick(data) {
      await this.findDataTableAndFormByName(data.record.id);
      await this.entityPage({ entityCurrent: 1, pid: data.record.id });
      const payload = {
        divVisible: data.selected,
        entityNameId: data.record.id,
        entityVisible: false,
      };
      dispatch.entity.setState(payload);
    },
  }),
};
