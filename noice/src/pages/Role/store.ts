import {createStore} from 'ice';
import role from './models/auto/role';
import customRole from './models/custom/role';
import user from "@/pages/User/models/auto/user";
import authority from "@/pages/Authority/models/auto/authority";

const store = createStore({
  role,
  customRole,
  user,
  authority,
});

export default store;
