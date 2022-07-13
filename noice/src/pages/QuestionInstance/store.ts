import {createStore} from 'ice';
import questionInstance from './models/auto/QuestionInstance';
import questionInstanceCustom from './models/custom/QuestionInstance';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  questionInstance,
  questionInstanceCustom,
  testPaperInstance,
});

export default store;
