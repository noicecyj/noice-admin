import {request} from 'ice';

export default {
  catalogPage(pageNumber) {
    return request({
      url: '/dictionaryApi/catalogPage',
      method: 'post',
      params: {
        pageNumber,
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
  catalogDelete(id) {
    return request({
      url: '/dictionaryApi/catalogDelete',
      method: 'post',
      params: {
        id,
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
