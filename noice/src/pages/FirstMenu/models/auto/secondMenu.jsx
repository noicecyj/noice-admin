import secondMenuService from '@/pages/FirstMenu/services/auto/secondMenu';
import initService from '@/services/init';

export default {

  namespace: 'secondMenu',

  state: {
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
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
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
    async secondMenuEdit(data) {
      if (data) {
        const secondMenu = await secondMenuService.findSecondMenuById(data.id);
        const fromData = {
          ...secondMenu.data,
        };
        const payload = {
          secondMenuFormData: fromData,
          secondMenuVisible: true,
        };
        dispatch.secondMenu.setState(payload);
      } else {
        const payload = {
          secondMenuFormData: {},
          secondMenuVisible: true,
        };
        dispatch.secondMenu.setState(payload);
      }
    },
    async secondMenuDelete(data) {
      await secondMenuService.secondMenuDelete(data.record.id);
      await this.secondMenuPage({ secondMenuCurrent: data.data.pageNumber, pid: data.data.pid });
      const payload = {
        secondMenuVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
    async secondMenuSave(data) {
      await secondMenuService.secondMenuSave({ ...data.secondMenuFormData, pid: data.pid });
      await this.secondMenuPage({ secondMenuCurrent: data.pageNumber, pid: data.pid });
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
      await this.secondMenuPage({ secondMenuCurrent: 1, pid });
      const payload = {
        secondMenuTable: ret.data.dataTable,
        secondMenuForm: ret.data.dataForm,
      };
      dispatch.secondMenu.setState(payload);
    },
    async onRowClick(data) {
      await this.findDataTableAndFormByName(data.record.id);
      await this.secondMenuPage({ secondMenuCurrent: 1, pid: data.record.id });
      const payload = {
        divVisible: data.selected,
        firstMenuId: data.record.id,
        secondMenuVisible: false,
      };
      dispatch.secondMenu.setState(payload);
    },
  }),
};
