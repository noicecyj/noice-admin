import firstMenuService from '@/pages/FirstMenu/services/auto/firstMenu';
import initService from '@/services/init';

export default {

  namespace: 'firstMenu',

  state: {
    firstMenuTitle: '添加',
    firstMenuTableData: [],
    firstMenuVisible: false,
    firstMenuFormData: {},
    firstMenuLoadingVisible: true,
    firstMenuTotal: 0,
    firstMenuCurrent: 1,
    firstMenuForm: [],
    firstMenuTable: [],
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
    async firstMenuPage(firstMenuCurrent) {
      const dataRes = await firstMenuService.firstMenuPage(firstMenuCurrent);
      const payload = {
        firstMenuTableData: dataRes.data.results,
        firstMenuTotal: dataRes.data.total,
        firstMenuCurrent,
        firstMenuLoadingVisible: false,
      };
      dispatch.firstMenu.setState(payload);
    },
    async firstMenuAdd() {
      const payload = {
        firstMenuFormData: {},
        firstMenuTitle: '添加',
        firstMenuVisible: true,
      };
      dispatch.entityName.setState(payload);
    },
    async firstMenuEdit(data) {
      const firstMenu = await firstMenuService.findFirstMenuById(data.id);
      const fromData = {
        ...firstMenu.data,
      };
      const payload = {
        firstMenuFormData: fromData,
        firstMenuTitle: '编辑',
        firstMenuVisible: true,
      };
      dispatch.firstMenu.setState(payload);
    },
    async firstMenuDelete(data) {
      await firstMenuService.firstMenuDelete(data.record.id);
      await this.firstMenuPage(data.data.pageNumber);
      const payload = {
        firstMenuVisible: false,
      };
      dispatch.firstMenu.setState(payload);
    },
    async firstMenuSave(data) {
      await firstMenuService.firstMenuSave(data.firstMenuFormData);
      await this.firstMenuPage(data.pageNumber);
      const payload = {
        firstMenuVisible: false,
      };
      dispatch.firstMenu.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        firstMenuFormData: data,
      };
      dispatch.firstMenu.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('first_menu');
      await this.firstMenuPage(1);
      const payload = {
        firstMenuTable: ret.data.dataTable,
        firstMenuForm: ret.data.dataForm,
        customType: ret.data.customType,
      };
      dispatch.firstMenu.setState(payload);
    },
  }),
};
