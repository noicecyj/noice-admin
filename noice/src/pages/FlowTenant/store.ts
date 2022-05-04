import {createStore} from 'ice';
import flowTenant from './models/auto/flowTenant';
import customFlowTenant from './models/custom/flowTenant';

const store = createStore({
  flowTenant,
  customFlowTenant,
});

export default store;
