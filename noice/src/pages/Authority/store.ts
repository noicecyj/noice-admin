import {createStore} from 'ice';
import authority from './models/auto/authority';
import customAuthority from './models/custom/authority';

const store = createStore({
  authority,
  customAuthority,
});

export default store;
