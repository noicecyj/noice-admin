import flowGroupService from '@/pages/FlowGroup/services/auto/flowGroup';
import initService from '@/services/init';

export default {

  namespace: 'flowGroup',

  state: {
    flowGroupTitle: '添加',
    flowGroupTableData: [],
    flowGroupVisible: false,
    flowGroupFormData: {},
    flowGroupLoadingVisible: true,
    flowGroupTotal: 0,
    flowGroupCurrent: 1,
    flowGroupForm: [],
    flowGroupTable: [],
    flowGroupId: '',
    customData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async flowGroupPage(flowGroupCurrent) {
      const dataRes = await flowGroupService.flowGroupPage(flowGroupCurrent);
      const payload = {
        flowGroupTableData: dataRes.data.results,
        flowGroupTotal: dataRes.data.total,
        flowGroupCurrent,
        flowGroupLoadingVisible: false,
      };
      dispatch.flowGroup.setState(payload);
    },
    async flowGroupAdd() {
      const payload = {
        flowGroupFormData: {},
        flowGroupTitle: '添加',
        flowGroupVisible: true,
      };
      dispatch.flowGroup.setState(payload);
    },
    async flowGroupEdit(data) {
      const flowGroup = await flowGroupService.findFlowGroupById(data.id);
      const fromData = {
        ...flowGroup.data,
      };
      const payload = {
        flowGroupFormData: fromData,
        flowGroupTitle: '编辑',
        flowGroupVisible: true,
      };
      dispatch.flowGroup.setState(payload);
    },
    async flowGroupDelete(data) {
      await flowGroupService.flowGroupDelete(data.record.id);
      await this.flowGroupPage(data.data.pageNumber);
      const payload = {
        flowGroupVisible: false,
      };
      dispatch.flowGroup.setState(payload);
    },
    async flowGroupSave(data) {
      await flowGroupService.flowGroupSave(data.flowGroupFormData);
      await this.flowGroupPage(data.pageNumber);
      const payload = {
        flowGroupVisible: false,
      };
      dispatch.flowGroup.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        flowGroupFormData: data,
      };
      dispatch.flowGroup.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('flow_group');
      await this.flowGroupPage(1);
      const payload = {
        flowGroupTable: ret.data.dataTable,
        flowGroupForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.flowGroup.setState(payload);
    },
  }),
};
