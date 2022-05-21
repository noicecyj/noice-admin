import {createStore} from 'ice';
import entity from './models/auto/entity';
import customEntity from './models/custom/entity';
import property from './models/auto/property';
import customProperty from './models/custom/property';

const store = createStore({
  entity,
  customEntity,
  property,
  customProperty,
});

export default store;
