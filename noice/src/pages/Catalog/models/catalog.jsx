import catalogService from '../services/catalog';
import initService from '@/services/init';

export default {

  namespace: 'catalog',

  state: {
    catalogTableData: [],
    catalogVisible: false,
    catalogFormData: {},
    catalogLoadingVisible: true,
    catalogTotal: 0,
    catalogCurrent: 1,
    catalogFormItem: [],
    catalogForm: [],
    catalogTable: [],
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async catalogPage(data) {
      const dataRes = await catalogService.catalogPage(data.catalogCurrent);
      const transformData = await initService.transformData(dataRes.data.content, data.catalogTable, data.catalogForm);
      const payload = {
        catalogTotal: dataRes.data.totalElements,
        catalogFormItem: transformData.data.objectForm,
        catalogTableData: transformData.data.objectList,
        catalogCurrent: data.catalogCurrent,
        catalogLoadingVisible: false,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogEdit(data) {
      if (data) {
        const catalog = await catalogService.findCatalogById(data.id);
        const fromData = {
          ...catalog.data,
        };
        const payload = {
          catalogFormData: fromData,
          catalogVisible: true,
        };
        dispatch.catalog.setState(payload);
      } else {
        const payload = {
          catalogFormData: {},
          catalogVisible: true,
        };
        dispatch.catalog.setState(payload);
      }
    },
    async catalogDelete(data) {
      await catalogService.catalogDelete(data.record);
      this.catalogPage({
        catalogCurrent: data.catalogCurrent,
        catalogTable: data.catalogTable,
        catalogForm: data.catalogForm,
      });
      const payload = {
        catalogVisible: false,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogSave(data) {
      await catalogService.catalogSave(data.catalogFormData);
      this.catalogPage({
        catalogCurrent: data.catalogCurrent,
        catalogTable: data.catalogTable,
        catalogForm: data.catalogForm,
      });
      const payload = {
        catalogVisible: false,
      };
      dispatch.catalog.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        catalogFormData: data,
      };
      dispatch.catalog.setState(payload);
    },
    async findDataTableAndFormByName() {
      const dataTableRes = await initService.findDataTableByName('catalogTable');
      const dataFormRes = await initService.findDataFormByName('catalogForm');
      this.catalogPage({
        catalogCurrent: 1,
        catalogTable: dataTableRes.data,
        catalogForm: dataFormRes.data,
      });
      const payload = {
        catalogTable: dataTableRes.data,
        catalogForm: dataFormRes.data,
      };
      dispatch.catalog.setState(payload);
    },
  }),
};
