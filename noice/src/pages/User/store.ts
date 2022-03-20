import {createStore} from 'ice';
import user from './models/auto/user';
import customUser from './models/custom/user';
import role from "@/pages/Role/models/auto/role";
import authority from "@/pages/Authority/models/auto/authority";

const store = createStore({
  user,
  customUser,
  role,
  authority,
});

export default store;
