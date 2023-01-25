package com.example.cyjauth.config;

import com.example.cyjauth.filter.JWTAuthenticationFilter;
import com.example.cyjauth.filter.MyFilterSecurityInterceptor;
import com.example.cyjauth.filter.MyUsernamePasswordAuthenticationFilter;
import com.example.cyjauth.filter.WebSecurityCorsFilter;
import com.example.cyjauth.handler.EntryPointUnauthorizedHandler;
import com.example.cyjauth.handler.RestAccessDeniedHandler;
import com.example.cyjauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author Noice
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected AuthenticationManager authenticationManager;
    private UserService userService;
    private AuthenticationSuccessHandler successHandler;
    private AuthenticationFailureHandler failHandler;
    private RestAccessDeniedHandler accessDeniedHandler;
    private EntryPointUnauthorizedHandler entryPointUnauthorizedHandler;
    private MyFilterSecurityInterceptor myFilterSecurityInterceptor;

    @Autowired
    public void setUserCustomService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setSuccessHandler(AuthenticationSuccessHandler successHandler) {
        this.successHandler = successHandler;
    }

    @Autowired
    public void setFailHandler(AuthenticationFailureHandler failHandler) {
        this.failHandler = failHandler;
    }

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Autowired
    public void setAccessDeniedHandler(RestAccessDeniedHandler accessDeniedHandler) {
        this.accessDeniedHandler = accessDeniedHandler;
    }

    @Autowired
    public void setEntryPointUnauthorizedHandler(EntryPointUnauthorizedHandler entryPointUnauthorizedHandler) {
        this.entryPointUnauthorizedHandler = entryPointUnauthorizedHandler;
    }

    @Autowired
    public void setMyFilterSecurityInterceptor(MyFilterSecurityInterceptor myFilterSecurityInterceptor) {
        this.myFilterSecurityInterceptor = myFilterSecurityInterceptor;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
        //密码加密使用 Spring Security 提供的BCryptPasswordEncoder.encode(user.getRawPassword().trim())
    }

    //修改AuthenticationManager的注入，解决http.getSharedObject(AuthenticationManager.class)无法获取AuthenticationManager实例的问题
    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        MyUsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter = new MyUsernamePasswordAuthenticationFilter();
        usernamePasswordAuthenticationFilter.setAuthenticationManager(authenticationManager);//设置登入处理方式
        usernamePasswordAuthenticationFilter.setAuthenticationSuccessHandler(successHandler);//设置登陆成功处理
        usernamePasswordAuthenticationFilter.setAuthenticationFailureHandler(failHandler); //设置登入失败处理
        JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter(authenticationManager);
        http.authorizeRequests();
        http
                //添加jtw鉴权过滤器
                .addFilterAt(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .addFilterAt(myFilterSecurityInterceptor, FilterSecurityInterceptor.class)
                //添加自定义权限过滤器
                .addFilterBefore(new WebSecurityCorsFilter(), ChannelProcessingFilter.class)
                //添加自定义登陆过滤器
                .addFilterAfter(usernamePasswordAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .cors()
                .and()
                //关闭csrf,所以请求可以访问
                .csrf().disable()
                .exceptionHandling().authenticationEntryPoint(entryPointUnauthorizedHandler).accessDeniedHandler(accessDeniedHandler)
                .and()
                //关闭session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                //登入方式  json:/v1/login
                .anyRequest().authenticated();
    }

}
