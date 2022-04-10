import {createStore} from 'ice';
import bpmn from './models/auto/bpmn';
import customBpmn from './models/custom/bpmn';

const store = createStore({
  bpmn,
  customBpmn,
});

export default store;
