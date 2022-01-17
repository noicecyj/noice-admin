import entityNameService from '@/pages/EntityName/services/auto/entityName';
import initService from '@/services/init';

export default {

  namespace: 'entityName',

  state: {
    entityNameTitle: '添加',
    entityNameTableData: [],
    entityNameVisible: false,
    entityNameFormData: {},
    entityNameLoadingVisible: true,
    entityNameTotal: 0,
    entityNameCurrent: 1,
    entityNameForm: [],
    entityNameTable: [],
    entityNameId: '',
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
          entityNameTitle: '编辑',
          entityNameVisible: true,
        };
        dispatch.entityName.setState(payload);
      } else {
        const payload = {
          entityNameFormData: {},
          entityNameTitle: '添加',
          entityNameVisible: true,
        };
        dispatch.entityName.setState(payload);
      }
    },
    async entityNameDelete(data) {
      await entityNameService.entityNameDelete(data.record.id);
      await this.entityNamePage(data.data.pageNumber);
      const payload = {
        entityNameVisible: false,
      };
      dispatch.entityName.setState(payload);
    },
    async entityNameSave(data) {
      await entityNameService.entityNameSave(data.entityNameFormData);
      await this.entityNamePage(data.pageNumber);
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
      await this.entityNamePage(1);
      const payload = {
        entityNameTable: ret.data.dataTable,
        entityNameForm: ret.data.dataForm,
      };
      dispatch.entityName.setState(payload);
    },
  }),
};
