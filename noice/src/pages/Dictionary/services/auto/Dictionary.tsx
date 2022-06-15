import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/dictionaryApi/pageDictionary',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/dictionaryApi/saveDictionary',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/dictionaryApi/deleteDictionary',
      method: 'post',
      data,
    });
  },
};
