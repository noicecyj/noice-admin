import { createModel } from 'ice';
import initService from "@/services/init";

interface Entity {
  name: string;
  id: string;
}

export default createModel({
  // 定义  model 的初始 state
  state: {
    name: '',
    id: '',
  } as Entity,
  // 定义改变该 model 状态的纯函数
  reducers: {
    update(state, payload) {
      return {
        ...state,
        ...payload,
      };
    },
  },
  // 定义处理该 model 副作用的函数
  effects: (dispatch) => ({
    async page(params: any, sort: any, filter: any, data: any) {
      console.log(sort);
      const dataRes = await initService.http({
        // url: data.pageUrl,
        url: '/entityCreateApi/Persistent/page',
        obj: params,
      });
      return {
        data: dataRes.data.records,
        // success 请返回 true，
        // 不然 table 会停止解析数据，即使有数据
        success: dataRes.code == 200,
        total: dataRes.data.total,
      };
    },
    async getUserInfo() {
      await delay(1000);
      this.update({
        name: 'taobao',
        id: '123',
      });
    },

  }),
})