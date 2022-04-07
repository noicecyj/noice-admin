import secondMenuService from '@/pages/FirstMenu/services/auto/secondMenu';
import initService from '@/services/init';

export default {

  namespace: 'secondMenu',

  state: {
    secondMenuTitle: '添加',
    secondMenuTableData: [],
    secondMenuFormData: {},
    secondMenuLoadingVisible: true,
    secondMenuTotal: 0,
    secondMenuCurrent: 1,
    secondMenuForm: [],
    secondMenuTable: [],
    secondMenuVisible: false,
    divVisible: false,
    firstMenuId: '',
    customType: false,
    formType: 'ONE_LIST',
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async secondMenuPage(data) {
      const dataRes = await secondMenuService.secondMenuPage(data.secondMenuCurrent, data.pid);
      const payload = {
        secondMenuTableData: dataRes.data.results,
        secondMenuTotal: dataRes.data.total,
        secondMenuCurrent: data.secondMenuCurrent,
        secondMenuLoadingVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
    async secondMenuAdd() {
      const payload = {
        secondMenuFormData: {},
        secondMenuTitle: '添加',
        secondMenuVisible: true,
      };
      dispatch.secondMenu.setState(payload);
    },
    async secondMenuEdit(data) {
      const secondMenu = await secondMenuService.findSecondMenuById(data.id);
      const fromData = {
        ...secondMenu.data,
      };
      const payload = {
        secondMenuFormData: fromData,
        secondMenuTitle: '编辑',
        secondMenuVisible: true,
      };
      dispatch.secondMenu.setState(payload);
    },
    async secondMenuDelete(data) {
      await secondMenuService.secondMenuDelete(data.record.id);
      await this.secondMenuPage({secondMenuCurrent: data.data.pageNumber, pid: data.data.pid});
      const payload = {
        secondMenuVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
    async secondMenuSave(data) {
      await secondMenuService.secondMenuSave({...data.secondMenuFormData, pid: data.pid});
      await this.secondMenuPage({secondMenuCurrent: data.pageNumber, pid: data.pid});
      const payload = {
        secondMenuVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        secondMenuFormData: data,
      };
      dispatch.secondMenu.setState(payload);
    },
    async findDataTableAndFormByName(pid) {
      const ret = await initService.findDataTableAndFormByName('second_menu');
      await this.secondMenuPage({secondMenuCurrent: 1, pid});
      const payload = {
        secondMenuTable: ret.data.dataTable,
        secondMenuForm: ret.data.dataForm,
        customType: ret.data.customType,
        formType: ret.data.formType,
      };
      dispatch.secondMenu.setState(payload);
    },
    async onRowClick(data) {
      await this.findDataTableAndFormByName(data.record.id);
      await this.secondMenuPage({secondMenuCurrent: 1, pid: data.record.id});
      const payload = {
        divVisible: data.selected,
        firstMenuId: data.record.id,
        secondMenuVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
  }),
};
