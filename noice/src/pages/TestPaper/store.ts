import {createStore} from 'ice';
import testPaper from './models/auto/TestPaper';
import testPaperCustom from './models/custom/TestPaper';
import testPaperConfig from '@/pages/TestPaperConfig/models/auto/TestPaperConfig';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  testPaper,
  testPaperCustom,
  testPaperConfig,
  testPaperInstance,
});

export default store;
