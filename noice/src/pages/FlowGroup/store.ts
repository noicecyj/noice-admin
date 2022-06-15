import {createStore} from 'ice';
import flowGroup from './models/auto/FlowGroup';
import flowGroupCustom from './models/custom/FlowGroup';

const store = createStore({
  flowGroup,
  flowGroupCustom,
});

export default store;
