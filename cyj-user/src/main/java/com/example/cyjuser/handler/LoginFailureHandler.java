package com.example.cyjuser.handler;

import com.example.cyjcommon.utils.ResponseUtil;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {

        @Override
        public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) {
                ResponseUtil.out(response, ResultVO.success(ResultCode.USERNAME_OR_PASSWORD_WRONG).toString());
        }

}
