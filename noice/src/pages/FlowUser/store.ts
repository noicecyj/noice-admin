import {createStore} from 'ice';
import flowUser from './models/auto/FlowUser';
import flowUserCustom from './models/custom/FlowUser';

const store = createStore({
  flowUser,
  flowUserCustom,
});

export default store;
