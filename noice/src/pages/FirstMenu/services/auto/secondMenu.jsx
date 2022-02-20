import { request } from 'ice';

export default {
  secondMenuPage(pageNumber, pid) {
    return request({
      url: '/entityCreateApi/secondMenuPage',
      method: 'post',
      params: {
        pageNumber,
        pid,
      },
    });
  },
  secondMenuSave(data) {
    return request({
      url: '/entityCreateApi/secondMenuSave',
      method: 'post',
      data,
    });
  },
  secondMenuDelete(id) {
    return request({
      url: '/entityCreateApi/secondMenuDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findSecondMenuById(id) {
    return request({
      url: '/entityCreateApi/findSecondMenuById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
