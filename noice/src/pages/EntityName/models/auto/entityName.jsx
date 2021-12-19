import entityNameService from '@/pages/EntityName/services/auto/entityName';
import initService from '@/services/init';

export default {

  namespace: 'entityName',

  state: {
    entityNameTableData: [],
    entityNameVisible: false,
    entityNameFormData: {},
    entityNameLoadingVisible: true,
    entityNameTotal: 0,
    entityNameCurrent: 1,
    entityNameFormItem: [],
    entityNameForm: [],
    entityNameTable: [],
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async entityNamePage(entityNameCurrent) {
      const dataRes = await entityNameService.entityNamePage(entityNameCurrent);
      const payload = {
        entityNameTableData: dataRes.data.results,
        entityNameTotal: dataRes.data.total,
        entityNameCurrent,
        entityNameLoadingVisible: false,
      };
      dispatch.entityName.setState(payload);
    },
    async entityNameEdit(data) {
      if (data) {
        const entityName = await entityNameService.findEntityNameById(data.id);
        const fromData = {
          ...entityName.data,
        };
        const payload = {
          entityNameFormData: fromData,
          entityNameVisible: true,
        };
        dispatch.entityName.setState(payload);
      } else {
        const payload = {
          entityNameFormData: {},
          entityNameVisible: true,
        };
        dispatch.entityName.setState(payload);
      }
    },
    async entityNameDelete(data) {
      await entityNameService.entityNameDelete(data.record.id);
      this.entityNamePage(data.data.pageNumber);
      const payload = {
        entityNameVisible: false,
      };
      dispatch.entityName.setState(payload);
    },
    async entityNameSave(data) {
      await entityNameService.entityNameSave(data.entityNameFormData);
      this.entityNamePage(data.entityNameCurrent);
      const payload = {
        entityNameVisible: false,
      };
      dispatch.entityName.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        entityNameFormData: data,
      };
      dispatch.entityName.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('entity_name');
      const payload = {
        entityNameTable: ret.data.dataTable,
        entityNameForm: ret.data.dataForm,
      };
      dispatch.entityName.setState(payload);
      this.entityNamePage(1);
    },
  }),
};
