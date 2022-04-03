import dictionaryService from '@/pages/Catalog/services/auto/dictionary';
import initService from '@/services/init';

export default {

  namespace: 'dictionary',

  state: {
    dictionaryTableData: [],
    dictionaryFormData: {},
    dictionaryLoadingVisible: true,
    dictionaryTotal: 0,
    dictionaryCurrent: 1,
    dictionaryForm: [],
    dictionaryTable: [],
    dictionaryVisible: false,
    divVisible: false,
    catalogId: '',
    customType: false,
    formType: 'ONE_LIST',
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async dictionaryPage(data) {
      const dataRes = await dictionaryService.dictionaryPage(data.dictionaryCurrent, data.pid);
      const payload = {
        dictionaryTableData: dataRes.data.results,
        dictionaryTotal: dataRes.data.total,
        dictionaryCurrent: data.dictionaryCurrent,
        dictionaryLoadingVisible: false,
      };
      dispatch.dictionary.setState(payload);
    },
    async dictionaryEdit(data) {
      if (data) {
        const dictionary = await dictionaryService.findDictionaryById(data.id);
        const fromData = {
          ...dictionary.data,
        };
        const payload = {
          dictionaryFormData: fromData,
          dictionaryVisible: true,
        };
        dispatch.dictionary.setState(payload);
      } else {
        const payload = {
          dictionaryFormData: {},
          dictionaryVisible: true,
        };
        dispatch.dictionary.setState(payload);
      }
    },
    async dictionaryDelete(data) {
      await dictionaryService.dictionaryDelete(data.record.id);
      await this.dictionaryPage({dictionaryCurrent: data.data.pageNumber, pid: data.data.pid});
      const payload = {
        dictionaryVisible: false,
      };
      dispatch.dictionary.setState(payload);
    },
    async dictionarySave(data) {
      await dictionaryService.dictionarySave({...data.dictionaryFormData, pid: data.pid});
      await this.dictionaryPage({dictionaryCurrent: data.pageNumber, pid: data.pid});
      const payload = {
        dictionaryVisible: false,
      };
      dispatch.dictionary.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        dictionaryFormData: data,
      };
      dispatch.dictionary.setState(payload);
    },
    async findDataTableAndFormByName(pid) {
      const ret = await initService.findDataTableAndFormByName('dictionary');
      await this.dictionaryPage({dictionaryCurrent: 1, pid});
      const payload = {
        dictionaryTable: ret.data.dataTable,
        dictionaryForm: ret.data.dataForm,
        customType: ret.data.customType,
      };
      dispatch.dictionary.setState(payload);
    },
    async onRowClick(data) {
      await this.findDataTableAndFormByName(data.record.id);
      await this.dictionaryPage({dictionaryCurrent: 1, pid: data.record.id});
      const payload = {
        divVisible: data.selected,
        catalogId: data.record.id,
        dictionaryVisible: false,
      };
      dispatch.dictionary.setState(payload);
    },
  }),
};
