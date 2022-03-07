import { createStore } from 'ice';
import entityName from './models/auto/entityName';
import customEntityName from './models/custom/entityName';
import entity from './models/auto/entity';
import customEntity from './models/custom/entity';

const store = createStore({
  entityName,
  customEntityName,
  entity,
  customEntity,
});

export default store;
