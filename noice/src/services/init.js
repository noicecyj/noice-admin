import {request} from 'ice';

export default {
  findCatalogByValue(value) {
    return request({
      url: '/dictionaryApi/findCatalogByValue',
      method: 'post',
      params: {
        value,
      },
    });
  },
  findDataTableAndFormByName(entityCode) {
    return request({
      url: '/entityCreateApi/findDataTableAndFormByName',
      method: 'post',
      params: {
        entityCode,
      },
    });
  },
};
