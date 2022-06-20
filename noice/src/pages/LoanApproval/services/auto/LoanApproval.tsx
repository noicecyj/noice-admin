import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/workFlowApi/pageLoanApproval',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/workFlowApi/saveLoanApproval',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/workFlowApi/deleteLoanApproval',
      method: 'post',
      data,
    });
  },
};
