package com.example.cyjauth.manager;

import com.example.cyjauth.entity.bo.AuthGrantedAuthority;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Service
public class MyAccessDecisionManager implements AccessDecisionManager {

    //decide方法判定当前请求路径是否拥有访问权限
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
            throws AccessDeniedException, InsufficientAuthenticationException {
        // 对应url没有权限时，直接跳出方法
        if (configAttributes == null) {
            return;
        }
        HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
        String url = null;
        PathMatcher pathMatcher = new AntPathMatcher();
        for (GrantedAuthority ga : authentication.getAuthorities()) {
            if (ga instanceof AuthGrantedAuthority) {
                AuthGrantedAuthority urlGrantedAuthority = (AuthGrantedAuthority) ga;
                url = urlGrantedAuthority.getUrl();
                String method = urlGrantedAuthority.getMethod();
                if ("/**".equals(url) && "ALL".equals(method)) {
                    return;
                }
                if (StringUtils.isNotBlank(url) && pathMatcher.match(url, request.getRequestURI())) {
                    return;
                }
            } else {
                //未登录只允许访问 login 页面
                if ("/authApi/v1/login".equals(url)) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("鉴权出错");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

}
