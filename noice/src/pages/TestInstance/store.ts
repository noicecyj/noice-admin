import {createStore} from 'ice';
import testInstance from './models/auto/TestInstance';
import testInstanceCustom from './models/custom/TestInstance';
import test from '@/pages/Test/models/auto/Test';
import questionInstanceAnswer from '@/pages/QuestionInstanceAnswer/models/auto/QuestionInstanceAnswer';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  testInstance,
  testInstanceCustom,
  test,
  questionInstanceAnswer,
  testPaperInstance,
});

export default store;
