import {request} from "ice";


export async function getForm(formCode: string) {
  return await request.get('/api/TableAndFormAndUrl/getForm' + formCode);
}

export async function getTable(formCode: string) {
  return await request.get('/api/TableAndFormAndUrl/getTable' + formCode);
}

export async function getUrl(formCode: string) {
  return await request.get('/api/TableAndFormAndUrl/getUrl' + formCode);
}
