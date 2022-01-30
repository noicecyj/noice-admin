import customEntityNameServices from '../../services/custom/entityName';
import initService from '@/services/init';
import {Message} from '@alifd/next';

export default {

  namespace: 'customEntityName',

  state: {
    chooseVisible: false,
    chooseFormData: {},
    chooseFountVisible: false,
    chooseFountFormData: {},
    LEVEL_ENTITY_TYPE: [],
    LEVEL_ENTITY_TYPE_FOUNT: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    findCatalogByValue(data) {
      initService.findCatalogByValue(data).then((res) => {
        const formArr = [];
        res.forEach((item) => {
          formArr.push({
            label: item.dictionaryName,
            value: item.dictionaryValue,
          });
        });
        const payload = JSON.parse(JSON.stringify({
          data: formArr,
        }).replace(/data/g, data));
        dispatch.customEntityName.setState(payload);
      });
    },
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
    createComponentFile(data) {
      customEntityNameServices.createComponentFile(data).then((res) => {
        if (res.code === 200) {
          Message.success('生成成功');
        } else {
          Message.error('生成失败');
        }
      });
    },
    chooseEntityFile(data) {
      const reg = /\[(.+?)\]/g;
      const fromData = {
        ...data,
        relEntity: data.relEntity === null ? null : data.relEntity.match(reg)[0].replace(reg, '$1').split(', '),
      };
      const entityName = {
        entityNameFormData: fromData,
      };
      dispatch.entityName.setState(entityName);
      const customEntityName = {
        chooseVisible: true,
      };
      dispatch.customEntityName.setState(customEntityName);
    },
    chooseFountEntityFile(data) {
      const reg = /\[(.+?)\]/g;
      const fromData = {
        ...data,
        relEntity: data.relEntity === null ? null : data.relEntity.match(reg)[0].replace(reg, '$1').split(', '),
      };
      const entityName = {
        entityNameFormData: fromData,
      };
      dispatch.entityName.setState(entityName);
      const customEntityName = {
        chooseFountVisible: true,
      };
      dispatch.customEntityName.setState(customEntityName);
    },
  }),
};
