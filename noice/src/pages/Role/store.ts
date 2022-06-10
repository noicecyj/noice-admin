import {createStore} from 'ice';
import role from './models/auto/role';
import roleCustom from './models/custom/role';
import user from "@/pages/User/models/auto/user";
import authority from "@/pages/Authority/models/auto/authority";

const store = createStore({
  role,
  roleCustom,
  user,
  authority,
});

export default store;
