import {createModel} from 'ice';
import initService from "@/services/init";

interface Entity {
  formData: any,
  title: string,
  visible: boolean,
}

interface pageResult {
  data: [],
  success: boolean,
  total: number
}

export default createModel({
  // 定义  model 的初始 state
  state: {
    formData: {},
    title: '添加',
    visible: false,
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
  effects: () => ({
    async page(data: {
      pageUrl: string;
      params: object;
    }) {
      console.log('page', data);
      const dataRes = await initService.http({
        url: data.pageUrl,
        obj: data.params,
      });
      return {
        data: dataRes.data.records,
        success: dataRes.code == 200,
        total: dataRes.data.total,
      } as pageResult;
    },
    async save(data: {
      saveUrl: any;
      formData: any;
    }) {
      const dataRes = await initService.http({
        url: data.saveUrl,
        obj: data.formData
      });
      return dataRes.code == 200;
    },
    async remove(data: {
      record: string;
      deleteUrl: string;
    }) {
      const dataRes = await initService.http({
        url: data.deleteUrl,
        obj: {
          id: data.record,
        }
      });
      return dataRes.code == 200;
    },
    add() {
      this.update({
        formData: {},
        title: '添加',
        visible: true,
      });
    },
    edit(data: any) {
      this.update({
        formData: data,
        title: '编辑',
        visible: true,
      });
    },
    async getOption(data: any) {
      const dataRes = await initService.http({
        url: data.pageUrl,
        obj: data.params,
      });
    }
  }),
})