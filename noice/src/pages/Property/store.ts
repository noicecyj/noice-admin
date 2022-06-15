import {createStore} from 'ice';
import property from './models/auto/Property';
import propertyCustom from './models/custom/Property';
import persistent from '@/pages/Persistent/models/auto/Persistent';

const store = createStore({
  property,
  propertyCustom,
  persistent,
});

export default store;
