import {createStore} from 'ice';
import catalog from './models/auto/Catalog';
import catalogCustom from './models/custom/Catalog';
import dictionary from '@/pages/Dictionary/models/auto/Dictionary';

const store = createStore({
  catalog,
  catalogCustom,
  dictionary,
});

export default store;
