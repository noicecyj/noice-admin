import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/workFlowApi/pageFlowUser',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/workFlowApi/saveFlowUser',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/workFlowApi/deleteFlowUser',
      method: 'post',
      data,
    });
  },
};
