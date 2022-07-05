import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageQuestionBase',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveQuestionBase',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteQuestionBase',
      method: 'post',
      data,
    });
  },
  pageQuestionByQuestionBase(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageQuestionByQuestionBase',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
