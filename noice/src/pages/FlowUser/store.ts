import {createStore} from 'ice';
import flowUser from './models/auto/flowUser';
import customFlowUser from './models/custom/flowUser';

const store = createStore({
  flowUser,
  customFlowUser,
});

export default store;
