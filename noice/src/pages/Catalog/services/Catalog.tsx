import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/dictionaryApi/pageCatalog',
      method: 'post',
      data: {
        po,
        pageNumber,
        pageSize,
      },
    });
  },
  save(po, user) {
    return request({
      url: '/dictionaryApi/saveCatalog',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/dictionaryApi/deleteCatalog',
      method: 'post',
      data,
    });
  },
};
