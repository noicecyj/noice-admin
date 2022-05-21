package com.example.cyjcommon.utils;

/**
 * @author Noice
 * @version 1.0
 * @date 2020/7/09 14:46
 */
public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(200, "成功"),
    LOGIN_SUCCESS(210, "登录成功"),
    FAILURE(400, "失败"),
    USERNAME_OR_PASSWORD_WRONG(401, "用户名或密码错误"),
    DENY(402, "您没有权限"),
    FORBIDDEN(403, "请登录后操作"),
    ACCOUNT_IS_BAN(404, "账户被禁用，请联系管理员"),
    TOKEN_IS_INVALID(405, "登录已失效，请重新登录"),
    TOKEN_IS_WRONG(406, "解析token错误"),
    TOKEN_IS_LOGOUT(407, "Token被注销，请重新登录"),
    AUTH_IS_CHANGE(408, "权限已变更，请重新登录"),
    USER_IS_NULL(409, "用户角色为空"),
    UNAUTHORIZED(410, "请登陆后操作");

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Override
    public String toString() {
        return this.name();
    }

}

