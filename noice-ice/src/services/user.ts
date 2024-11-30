import type {LoginParams, LoginResult} from '@/interfaces/user';
import type {Result} from '@/interfaces/common';
import {request} from 'ice';

export async function login(data: LoginParams): Promise<Result<LoginResult>> {
  return await request.post('/userApi/v1/login', data);
}

export async function fetchUserInfo() {
  return await request.get('/userApi/v1/getUserInfo');
}

export async function logout() {
  console.log('logout');
  return await request.get('/userApi/v1/logout');
}

export async function getUserMenu() {
  return await request.get('/userApi/v1/getUserMenu');
}