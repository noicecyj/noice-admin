import type {LoginParams, LoginResult} from '@/interfaces/user';
import type {Result} from '@/interfaces/common';
import {request} from 'ice';

export async function login(data: LoginParams): Promise<Result<LoginResult>> {
    return await request.post('/api/v1/login', data);
}

export async function fetchUserInfo(token: string) {
    return await request.get('/api/v1/getUserInfo', {
        headers: {
            'token': token || '',
        }
    });
}

export async function logout() {
    console.log('logout');
    return await request.get('/api/v1/logout');
}

export async function getUserMenu() {
    return await request.get('/api/v1/getUserMenu');
}