import {createStore} from 'ice';
import role from './models/auto/Role';
import roleCustom from './models/custom/Role';
import user from "@/pages/User/models/auto/User";
import authority from "@/pages/Authority/models/auto/Authority";

const store = createStore({
  role,
  roleCustom,
  user,
  authority,
});

export default store;
