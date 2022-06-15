import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/dictionaryApi/pageCatalog',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/dictionaryApi/saveCatalog',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/dictionaryApi/deleteCatalog',
      method: 'post',
      data,
    });
  },
  pageDictionaryByCatalog(pageNumber, id) {
    return request({
      url: '/dictionaryApi/pageDictionaryByCatalog',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
