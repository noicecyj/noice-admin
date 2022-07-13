import {createStore} from 'ice';
import testPaperConfig from './models/auto/TestPaperConfig';
import testPaperConfigCustom from './models/custom/TestPaperConfig';
import testPaper from '@/pages/TestPaper/models/auto/TestPaper';

const store = createStore({
  testPaperConfig,
  testPaperConfigCustom,
  testPaper,
});

export default store;
