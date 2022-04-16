import bpmnService from '@/pages/Bpmn/services/auto/bpmn';
import initService from '@/services/init';

export default {

  namespace: 'bpmn',

  state: {
    bpmnTitle: '添加',
    bpmnTableData: [],
    bpmnVisible: false,
    bpmnFormData: {},
    bpmnLoadingVisible: true,
    bpmnTotal: 0,
    bpmnCurrent: 1,
    bpmnForm: [],
    bpmnTable: [],
    bpmnId: '',
    customData: {},
    customType: false,
    formType: 'ONE_LIST',
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async bpmnPage(bpmnCurrent) {
      const dataRes = await bpmnService.bpmnPage(bpmnCurrent);
      const payload = {
        bpmnTableData: dataRes.data.results,
        bpmnTotal: dataRes.data.total,
        bpmnCurrent,
        bpmnLoadingVisible: false,
      };
      dispatch.bpmn.setState(payload);
    },
    async bpmnAdd() {
      const payload = {
        bpmnFormData: {},
        bpmnTitle: '添加',
        bpmnVisible: true,
      };
      dispatch.bpmn.setState(payload);
    },
    async bpmnEdit(data) {
      const bpmn = await bpmnService.findBpmnById(data.id);
      const fromData = {
        ...bpmn.data,
      };
      const payload = {
        bpmnFormData: fromData,
        bpmnTitle: '编辑',
        bpmnVisible: true,
      };
      dispatch.bpmn.setState(payload);
    },
    async bpmnDelete(data) {
      await bpmnService.bpmnDelete(data.record.id);
      await this.bpmnPage(data.data.pageNumber);
      const payload = {
        bpmnVisible: false,
      };
      dispatch.bpmn.setState(payload);
    },
    async bpmnSave(data) {
      await bpmnService.bpmnSave(data.bpmnFormData);
      await this.bpmnPage(data.pageNumber);
      const payload = {
        bpmnVisible: false,
      };
      dispatch.bpmn.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        bpmnFormData: data,
      };
      dispatch.bpmn.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('bpmn');
      await this.bpmnPage(1);
      const payload = {
        bpmnTable: ret.data.dataTable,
        bpmnForm: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.bpmn.setState(payload);
    },
  }),
};
