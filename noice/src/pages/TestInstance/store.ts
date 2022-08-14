import {createStore} from 'ice';
import testInstance from './models/auto/TestInstance';
import testInstanceCustom from './models/custom/TestInstance';
import testInstanceAnswer from '@/pages/TestInstanceAnswer/models/auto/TestInstanceAnswer';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  testInstance,
  testInstanceCustom,
  testInstanceAnswer,
  testPaperInstance,
});

export default store;
