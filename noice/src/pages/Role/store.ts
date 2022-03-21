import {createStore} from 'ice';
import role from './models/auto/role';
import customRole from './models/custom/role';
import authority from "@/pages/Authority/models/auto/authority";

const store = createStore({
  role,
  customRole,
  authority,
});

export default store;
