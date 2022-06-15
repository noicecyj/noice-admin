import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/workFlowApi/pageFlowTenant',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/workFlowApi/saveFlowTenant',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/workFlowApi/deleteFlowTenant',
      method: 'post',
      data,
    });
  },
};
