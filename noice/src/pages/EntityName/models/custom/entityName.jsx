import customEntityNameServices from '../../services/custom/entityName';
import initService from '@/services/init';
import { Message } from '@alifd/next';

export default {

  namespace: 'customEntityName',

  state: {
    chooseVisible: false,
    chooseFormData: {},
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    createEntityFile(data) {
      customEntityNameServices.createEntityFile(data).then((res) => {
        if (res.code === 200) {
          Message.success('生成成功');
        } else {
          Message.error('生成失败');
        }
      });
      const entityName = {
        entityNameFormData: {},
      };
      dispatch.entityName.setState(entityName);
      const customEntityName = {
        chooseVisible: false,
      };
      dispatch.customEntityName.setState(customEntityName);
    },
  }),
};
