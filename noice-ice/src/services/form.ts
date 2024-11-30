import {request} from "ice";


export async function getForm(formCode: string) {
  return await request.get('/entityCreateApi/TableAndForm/getForm' + formCode);
}
