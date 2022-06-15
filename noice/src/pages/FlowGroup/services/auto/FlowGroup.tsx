import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/workFlowApi/pageFlowGroup',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/workFlowApi/saveFlowGroup',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/workFlowApi/deleteFlowGroup',
      method: 'post',
      data,
    });
  },
};
