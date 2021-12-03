package com.example.cyjuser.handler;

import com.example.cyjcommon.utils.ResponseUtil;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class EntryPointUnauthorizedHandler implements AuthenticationEntryPoint {

        @Override
        public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) {
                ResponseUtil.out(response, ResultVO.success(ResultCode.FORBIDDEN).toString());
        }

}
