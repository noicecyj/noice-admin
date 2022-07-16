import {request} from 'ice';

export default {
  createTestPaperInstance(data) {
    return request({
      url: '/entityCreateApi/createTestPaperInstance',
      method: 'post',
      data,
    });
  },
};
