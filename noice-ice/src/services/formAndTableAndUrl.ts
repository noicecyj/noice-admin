import {request} from "ice";


export async function getForm(formCode: string) {
  return await request.get('/entityCreateApi/TableAndFormAndUrl/getForm' + formCode);
}

export async function getTable(formCode: string) {
  return await request.get('/entityCreateApi/TableAndFormAndUrl/getTable' + formCode);
}

export async function getTableSelect(formCode: string) {
  return await request.get('/entityCreateApi/TableAndFormAndUrl/getTableSelect' + formCode);
}

export async function getUrl(formCode: string) {
  return await request.get('/entityCreateApi/TableAndFormAndUrl/getUrl' + formCode);
}
