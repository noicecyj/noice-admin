import {request} from 'ice';

export default {
  flowUserPage(pageNumber) {
    return request({
      url: '/workFlowApi/flowUserPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  flowUserSave(data) {
    return request({
      url: '/workFlowApi/flowUserSave',
      method: 'post',
      data,
    });
  },
  flowUserDelete(id) {
    return request({
      url: '/workFlowApi/flowUserDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findFlowUserById(id) {
    return request({
      url: '/workFlowApi/findFlowUserById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
