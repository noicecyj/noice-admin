import {createStore} from 'ice';
import flowGroup from './models/auto/flowGroup';
import customFlowGroup from './models/custom/flowGroup';

const store = createStore({
  flowGroup,
  customFlowGroup,
});

export default store;
