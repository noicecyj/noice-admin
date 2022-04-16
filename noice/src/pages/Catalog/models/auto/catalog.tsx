import catalogService from '@/pages/Catalog/services/auto/catalog';
import initService from '@/services/init';

export default {

  namespace: 'catalog',

  state: {
    catalogTitle: '添加',
    catalogTableData: [],
    catalogVisible: false,
    catalogFormData: {},
    catalogLoadingVisible: true,
    catalogTotal: 0,
    catalogCurrent: 1,
    catalogForm: [],
    catalogTable: [],
    catalogId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async catalogPage(catalogCurrent) {
      const dataRes = await catalogService.catalogPage(catalogCurrent);
      const payload = {
        catalogTableData: dataRes.data.results,
        catalogTotal: dataRes.data.total,
        catalogCurrent,
        catalogLoadingVisible: false,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogAdd() {
      const payload = {
        catalogFormData: {},
        catalogTitle: '添加',
        catalogVisible: true,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogEdit(data) {
      const catalog = await catalogService.findCatalogById(data.id);
      const fromData = {
        ...catalog.data,
      };
      const payload = {
        catalogFormData: fromData,
        catalogTitle: '编辑',
        catalogVisible: true,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogDelete(data) {
      await catalogService.catalogDelete(data.record.id);
      await this.catalogPage(data.data.pageNumber);
      const payload = {
        catalogVisible: false,
      };
      dispatch.catalog.setState(payload);
    },
    async catalogSave(data) {
      await catalogService.catalogSave(data.catalogFormData);
      await this.catalogPage(data.pageNumber);
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
      const ret = await initService.findDataTableAndFormByName('catalog');
      await this.catalogPage(1);
      const payload = {
        catalogTable: ret.data.dataTable,
        catalogForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.catalog.setState(payload);
    },
  }),
};
