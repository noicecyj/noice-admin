import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/QuestionBase/services/auto/QuestionBase';
import questionService from '@/pages/Question/services/auto/Question'

export default {

  namespace: 'questionBase',

  state: {
    title: '添加',
    tableData: [],
    visible: false,
    formData: {},
    loadingVisible: true,
    total: 0,
    current: 1,
    form: [],
    table: [],
    customData: {},
    divVisible: false,
    parent: "",
    select: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async page(current) {
      const dataRes = await service.page(current);
      const payload = {
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current,
        loadingVisible: false,
      };
      dispatch.questionBase.setState(payload);
    },
    async save(data) {
      const ret = await service.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.questionBase.setState(payload);
      }
    },
    async delete(data) {
      const ret = await service.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.questionBase.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.questionBase.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.questionBase.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.questionBase.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('question_base');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.questionBase.setState(payload);
    },
    async pageQuestionByQuestionBase(data) {
      const ret = await initService.findDataTableAndFormByName('question');
      const dataRes = await service.pageQuestionByQuestionBase(data.current, data.id);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.question.setState(payload);
    },
    async saveQuestionByQuestionBase(data) {
      const ret = await questionService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pageQuestionByQuestionBase({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.question.setState(payload);
      }
    },
    async deleteQuestionByQuestionBase(data) {
      const ret = await questionService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pageQuestionByQuestionBase({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.question.setState(payload);
      }
    },
  }),
};
