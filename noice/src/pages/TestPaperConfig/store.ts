import {createStore} from 'ice';
import testPaperConfig from './models/auto/TestPaperConfig';
import testPaperConfigCustom from './models/custom/TestPaperConfig';
import testPaper from '@/pages/TestPaper/models/auto/TestPaper';
import questionBase from '@/pages/QuestionBase/models/auto/QuestionBase';

const store = createStore({
  testPaperConfig,
  testPaperConfigCustom,
  testPaper,
  questionBase,
});

export default store;
