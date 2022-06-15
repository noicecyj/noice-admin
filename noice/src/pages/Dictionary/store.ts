import {createStore} from 'ice';
import dictionary from './models/auto/Dictionary';
import dictionaryCustom from './models/custom/Dictionary';
import catalog from '@/pages/Catalog/models/auto/Catalog';

const store = createStore({
  dictionary,
  dictionaryCustom,
  catalog,
});

export default store;
