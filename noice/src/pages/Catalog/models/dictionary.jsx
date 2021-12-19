import dictionaryService from '../services/dictionary';
import initService from '@/services/init';

export default {

  namespace: 'dictionary',

  state: {
    dictionaryTableData: [],
    dictionaryVisible: false,
    dictionaryFormData: {},
    dictionaryLoadingVisible: true,
    dictionaryTotal: 0,
    dictionaryCurrent: 1,
    dictionaryFormItem: [],
    dictionaryForm: [],
    dictionaryTable: [],
    divVisible: false,
    catalogId: '',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    async dictionaryPage(data) {
      const dataRes = await dictionaryService.dictionaryPage(data.catalogId, data.dictionaryCurrent);
      const transformData = await initService.transformData(dataRes.data.content, data.dictionaryTable, data.dictionaryForm);
      const payload = {
        dictionaryTotal: dataRes.data.totalElements,
        dictionaryFormItem: transformData.data.objectForm,
        dictionaryTableData: transformData.data.objectList,
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
      await dictionaryService.dictionaryDelete(data.record);
      this.dictionaryPage({
        dictionaryCurrent: data.dictionaryCurrent,
        dictionaryTable: data.dictionaryTable,
        dictionaryForm: data.dictionaryForm,
        catalogId: data.catalogId,
      });
      const payload = {
        dictionaryVisible: false,
      };
      dispatch.dictionary.setState(payload);
    },
    async dictionarySave(data) {
      await dictionaryService.dictionarySave(data.catalogId, data.dictionaryFormData);
      this.dictionaryPage({
        dictionaryCurrent: data.dictionaryCurrent,
        dictionaryTable: data.dictionaryTable,
        dictionaryForm: data.dictionaryForm,
        catalogId: data.catalogId,
      });
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
    async onRowClick(data) {
      const dataFormRes = await initService.findDataFormByName('dictionaryForm');
      const dataTableRes = await initService.findDataTableByName('dictionaryTable');
      const payload = {
        divVisible: data.selected,
        dictionaryTable: dataTableRes.data,
        dictionaryForm: dataFormRes.data,
        catalogId: data.record.id,
      };
      dispatch.dictionary.setState(payload);
      this.dictionaryPage({
        dictionaryCurrent: 1,
        dictionaryTable: dataTableRes.data,
        dictionaryForm: dataFormRes.data,
        catalogId: data.record.id,
      });
    },
  }),
};
