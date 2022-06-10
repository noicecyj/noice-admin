import {createStore} from 'ice';
import user from './models/auto/user';
import userCustom from './models/custom/user';
import enterprise from "@/pages/Enterprise/models/auto/enterprise";
import role from "@/pages/Role/models/auto/role";
import authority from "@/pages/Authority/models/auto/authority";

const store = createStore({
  user,
  userCustom,
  enterprise,
  role,
  authority,
});

export default store;
