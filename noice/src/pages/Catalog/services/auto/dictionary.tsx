import { request } from 'ice';

export default {
  dictionaryPage(pageNumber, pid) {
    return request({
      url: '/dictionaryApi/dictionaryPage',
      method: 'post',
      params: {
        pageNumber,
        pid,
      },
    });
  },
  dictionarySave(data) {
    return request({
      url: '/dictionaryApi/dictionarySave',
      method: 'post',
      data,
    });
  },
  dictionaryDelete(id) {
    return request({
      url: '/dictionaryApi/dictionaryDelete',
      method: 'post',
      params: {
        id,
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
