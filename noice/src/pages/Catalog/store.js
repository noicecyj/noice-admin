import { createStore } from 'ice';
import catalog from './models/auto/catalog';
import customCatalog from './models/custom/catalog';
import dictionary from './models/auto/dictionary';
import customDictionary from './models/custom/dictionary';

const store = createStore({
  catalog,
  customCatalog,
  dictionary,
  customDictionary,
});

export default store;
