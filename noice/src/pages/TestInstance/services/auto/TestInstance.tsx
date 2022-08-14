import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageTestInstance',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveTestInstance',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteTestInstance',
      method: 'post',
      data,
    });
  },
  pageTestInstanceAnswerByTestInstance(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageTestInstanceAnswerByTestInstance',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
