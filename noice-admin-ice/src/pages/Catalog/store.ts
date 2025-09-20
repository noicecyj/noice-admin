import {createStore} from 'ice';
import Catalog from './models/Catalog';
import CatalogDictionary from './models/CatalogDictionary';

const store = createStore({
  Catalog,
  CatalogDictionary
});

export default store;
