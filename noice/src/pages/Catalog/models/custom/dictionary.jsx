import customDictionaryServices from '../../services/custom/dictionary';
import initService from '@/services/init';

export default {

  namespace: 'customDictionary',

  state: {

  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    findCatalogByValue(data) {
      initService.findCatalogByValue(data).then((res) => {
        const formArr = [];
        res.forEach((item) => {
          formArr.push({
            label: item.dictionaryName,
            value: item.dictionaryValue,
          });
        });
        const payload = JSON.parse(JSON.stringify({
          data: formArr,
        }).replace(/data/g, data));
        dispatch.customDictionary.setState(payload);
      });
    },
  }),
};
