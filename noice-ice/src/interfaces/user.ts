export interface UserInfo {
  id: string;
  userName: string;
  userCode: string;
}

export interface UserAuth {
  authKey?: boolean;
}

export interface LoginParams {
  userName: string;
  password: string;
}

export interface LoginResult {
  success?: boolean;
  token?: string;
}
