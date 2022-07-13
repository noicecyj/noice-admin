import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageTestPaperInstance',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveTestPaperInstance',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteTestPaperInstance',
      method: 'post',
      data,
    });
  },
  pageQuestionInstanceByTestPaperInstance(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageQuestionInstanceByTestPaperInstance',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
