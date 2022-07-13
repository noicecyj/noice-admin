import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageTestPaper',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveTestPaper',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteTestPaper',
      method: 'post',
      data,
    });
  },
  pageTestPaperConfigByTestPaper(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageTestPaperConfigByTestPaper',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
  pageTestPaperInstanceByTestPaper(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageTestPaperInstanceByTestPaper',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
