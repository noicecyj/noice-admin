import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageSubject',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveSubject',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteSubject',
      method: 'post',
      data,
    });
  },
};
