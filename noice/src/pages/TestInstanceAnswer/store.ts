import {createStore} from 'ice';
import testInstanceAnswer from './models/auto/TestInstanceAnswer';
import testInstanceAnswerCustom from './models/custom/TestInstanceAnswer';
import questionInstance from '@/pages/QuestionInstance/models/auto/QuestionInstance';
import testInstance from '@/pages/TestInstance/models/auto/TestInstance';

const store = createStore({
  testInstanceAnswer,
  testInstanceAnswerCustom,
  questionInstance,
  testInstance,
});

export default store;
