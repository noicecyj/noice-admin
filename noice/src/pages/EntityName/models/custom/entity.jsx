import customEntityServices from '../../services/custom/entity';
import initService from '@/services/init';

export default {

  namespace: 'customEntity',

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
        dispatch.customEntity.setState(payload);
      });
    },
    upEntity(data) {
      customEntityServices.upEntity(data.record.id).then(() => {
        dispatch.entity.entityPage(data.record.pid, data.entityCurrent);
      });
      const payload = { entityVisible: false };
      dispatch.entity.setState(payload);
    },
    downEntity(data) {
      customEntityServices.downEntity(data.record.id).then(() => {
        dispatch.entity.entityPage(data.record.pid, data.entityCurrent);
      });
      const payload = { entityVisible: false };
      dispatch.entity.setState(payload);
    },
  }),
};
