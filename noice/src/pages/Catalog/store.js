import { createStore } from 'ice';
import catalog from './models/catalog';
import customCatalog from './models/custom/catalog';
import dictionary from './models/dictionary';
import customDictionary from './models/custom/dictionary';

const store = createStore({
  catalog,
  customCatalog,
  dictionary,
  customDictionary,
});

export default store;
