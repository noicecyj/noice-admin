import {request} from 'ice';

export default {
  flowGroupPage(pageNumber) {
    return request({
      url: '/workFlowApi/flowGroupPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  flowGroupSave(data) {
    return request({
      url: '/workFlowApi/flowGroupSave',
      method: 'post',
      data,
    });
  },
  flowGroupDelete(id) {
    return request({
      url: '/workFlowApi/flowGroupDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findFlowGroupById(id) {
    return request({
      url: '/workFlowApi/findFlowGroupById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
