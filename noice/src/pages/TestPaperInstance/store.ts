import {createStore} from 'ice';
import testPaperInstance from './models/auto/TestPaperInstance';
import testPaperInstanceCustom from './models/custom/TestPaperInstance';
import testPaper from '@/pages/TestPaper/models/auto/TestPaper';
import questionInstance from '@/pages/QuestionInstance/models/auto/QuestionInstance';

const store = createStore({
  testPaperInstance,
  testPaperInstanceCustom,
  testPaper,
  questionInstance,
});

export default store;
