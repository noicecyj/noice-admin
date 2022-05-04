import flowTenantService from '@/pages/FlowTenant/services/auto/flowTenant';
import initService from '@/services/init';

export default {

  namespace: 'flowTenant',

  state: {
    flowTenantTitle: '添加',
    flowTenantTableData: [],
    flowTenantVisible: false,
    flowTenantFormData: {},
    flowTenantLoadingVisible: true,
    flowTenantTotal: 0,
    flowTenantCurrent: 1,
    flowTenantForm: [],
    flowTenantTable: [],
    flowTenantId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async flowTenantPage(flowTenantCurrent) {
      const dataRes = await flowTenantService.flowTenantPage(flowTenantCurrent);
      const payload = {
        flowTenantTableData: dataRes.data.results,
        flowTenantTotal: dataRes.data.total,
        flowTenantCurrent,
        flowTenantLoadingVisible: false,
      };
      dispatch.flowTenant.setState(payload);
    },
    async flowTenantAdd() {
      const payload = {
        flowTenantFormData: {},
        flowTenantTitle: '添加',
        flowTenantVisible: true,
      };
      dispatch.flowTenant.setState(payload);
    },
    async flowTenantEdit(data) {
      const flowTenant = await flowTenantService.findFlowTenantById(data.id);
      const fromData = {
        ...flowTenant.data,
      };
      const payload = {
        flowTenantFormData: fromData,
        flowTenantTitle: '编辑',
        flowTenantVisible: true,
      };
      dispatch.flowTenant.setState(payload);
    },
    async flowTenantDelete(data) {
      await flowTenantService.flowTenantDelete(data.record.id);
      await this.flowTenantPage(data.data.pageNumber);
      const payload = {
        flowTenantVisible: false,
      };
      dispatch.flowTenant.setState(payload);
    },
    async flowTenantSave(data) {
      await flowTenantService.flowTenantSave(data.flowTenantFormData);
      await this.flowTenantPage(data.pageNumber);
      const payload = {
        flowTenantVisible: false,
      };
      dispatch.flowTenant.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        flowTenantFormData: data,
      };
      dispatch.flowTenant.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('flow_tenant');
      await this.flowTenantPage(1);
      const payload = {
        flowTenantTable: ret.data.dataTable,
        flowTenantForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.flowTenant.setState(payload);
    },
  }),
};
