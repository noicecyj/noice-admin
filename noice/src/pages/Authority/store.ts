import {createStore} from 'ice';
import authority from './models/auto/authority';
import authorityCustom from './models/custom/authority';
import appService from "@/pages/AppService/models/auto/appService";
import entity from "@/pages/Entity/models/auto/entity";
import user from "@/pages/User/models/auto/user";
import role from "@/pages/Role/models/auto/role";

const store = createStore({
  authority,
  authorityCustom,
  appService,
  entity,
  user,
  role,
});

export default store;
