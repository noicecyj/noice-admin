import {request} from 'ice';

export default {
  firstMenuPage(pageNumber) {
    return request({
      url: '/entityCreateApi/firstMenuPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  firstMenuSave(data) {
    return request({
      url: '/entityCreateApi/firstMenuSave',
      method: 'post',
      data,
    });
  },
  firstMenuDelete(id) {
    return request({
      url: '/entityCreateApi/firstMenuDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findFirstMenuById(id) {
    return request({
      url: '/entityCreateApi/findFirstMenuById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
