import {createStore} from 'ice';
import flowTenant from './models/auto/FlowTenant';
import flowTenantCustom from './models/custom/FlowTenant';

const store = createStore({
  flowTenant,
  flowTenantCustom,
});

export default store;
