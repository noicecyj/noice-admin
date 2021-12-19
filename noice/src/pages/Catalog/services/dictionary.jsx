import { request } from 'ice';

export default {
  dictionaryPage(id, value) {
    return request({
      url: '/dictionaryApi/dictionaryPage',
      method: 'post',
      params: {
        id,
        pageNumber: value,
        pageSize: 8,
        sortCode: 'sortCode',
      },
    });
  },
  dictionarySave(catalogId, dictionaryFormData) {
    return request({
      url: '/dictionaryApi/dictionarySave',
      method: 'post',
      data: { ...dictionaryFormData, pid: catalogId },
    });
  },
  dictionaryDelete(record) {
    return request({
      url: '/dictionaryApi/dictionaryDelete',
      method: 'post',
      params: {
        id: record.id,
      },
    });
  },
  findDictionaryById(id) {
    return request({
      url: '/dictionaryApi/findDictionaryById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
