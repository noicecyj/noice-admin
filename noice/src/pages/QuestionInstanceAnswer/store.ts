import {createStore} from 'ice';
import questionInstanceAnswer from './models/auto/QuestionInstanceAnswer';
import questionInstanceAnswerCustom from './models/custom/QuestionInstanceAnswer';
import questionInstance from '@/pages/QuestionInstance/models/auto/QuestionInstance';
import testInstance from '@/pages/TestInstance/models/auto/TestInstance';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  questionInstanceAnswer,
  questionInstanceAnswerCustom,
  questionInstance,
  testInstance,
  testPaperInstance,
});

export default store;
