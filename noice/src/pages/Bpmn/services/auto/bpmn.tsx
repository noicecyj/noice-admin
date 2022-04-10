import {request} from 'ice';

export default {
  bpmnPage(pageNumber) {
    return request({
      url: '/workFlowApi/bpmnPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  bpmnSave(data) {
    return request({
      url: '/workFlowApi/bpmnSave',
      method: 'post',
      data,
    });
  },
  bpmnDelete(id) {
    return request({
      url: '/workFlowApi/bpmnDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findBpmnById(id) {
    return request({
      url: '/workFlowApi/findBpmnById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
