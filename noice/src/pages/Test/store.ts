import {createStore} from 'ice';
import test from './models/auto/Test';
import testCustom from './models/custom/Test';
import testPaper from '@/pages/TestPaper/models/auto/TestPaper';

const store = createStore({
  test,
  testCustom,
  testPaper,
});

export default store;
