import { request } from 'ice';

export default {
  catalogPage(value) {
    return request({
      url: '/dictionaryApi/catalogPage',
      method: 'post',
      params: {
        pageNumber: value,
        pageSize: 8,
        sortCode: 'sortCode',
      },
    });
  },
  catalogSave(data) {
    return request({
      url: '/dictionaryApi/catalogSave',
      method: 'post',
      data,
    });
  },
  catalogDelete(record) {
    return request({
      url: '/dictionaryApi/catalogDelete',
      method: 'post',
      params: {
        id: record.id,
      },
    });
  },
  findCatalogById(id) {
    return request({
      url: '/dictionaryApi/findCatalogById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
