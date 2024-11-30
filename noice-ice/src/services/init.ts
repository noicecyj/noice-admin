import {request} from 'ice';

export default {
  http(data) {
    console.log(data)
    return request({
      url: data.url,
      method: !!data.method ? data.method : 'post',
      data: data.obj,
    });
  },
};
