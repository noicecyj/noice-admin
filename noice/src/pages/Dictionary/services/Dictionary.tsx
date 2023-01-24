import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/dictionaryApi/pageDictionary',
      method: 'post',
      data: {
        po,
        pageNumber,
        pageSize,
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
