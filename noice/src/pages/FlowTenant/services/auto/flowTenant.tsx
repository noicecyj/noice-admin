import {request} from 'ice';

export default {
  flowTenantPage(pageNumber) {
    return request({
      url: '/workFlowApi/flowTenantPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  flowTenantSave(data) {
    return request({
      url: '/workFlowApi/flowTenantSave',
      method: 'post',
      data,
    });
  },
  flowTenantDelete(id) {
    return request({
      url: '/workFlowApi/flowTenantDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findFlowTenantById(id) {
    return request({
      url: '/workFlowApi/findFlowTenantById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
