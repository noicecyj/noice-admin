import {createStore} from 'ice';
import test from './models/auto/Test';
import testCustom from './models/custom/Test';
import testPaperInstance from '@/pages/TestPaperInstance/models/auto/TestPaperInstance';

const store = createStore({
  test,
  testCustom,
  testPaperInstance,
});

export default store;
