import {createStore} from 'ice';
import authority from './models/auto/Authority';
import authorityCustom from './models/custom/Authority';

const store = createStore({
  authority,
  authorityCustom,
});

export default store;
