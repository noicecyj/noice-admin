package noice.handler;

import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import noice.common.contants.UserContext;
import noice.entity.po.bean.UserPo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class TokenFilter extends OncePerRequestFilter {

    private StringRedisTemplate redisTemplate;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull FilterChain filterChain) throws ServletException, IOException {
        // 获取请求的路径
        String requestPath = request.getRequestURI();

        // 如果请求的是登录接口，不进行Token验证
        if (requestPath.equals("/userApi/v1/login") && request.getMethod().equals(RequestMethod.POST.name())) {
            filterChain.doFilter(request, response);
            return;
        }
        // 在请求头中获取 Token
        String token = request.getHeader("Token");
        // 校验 Token 的逻辑，这里需要根据你的实际业务来实现
        if (token != null && this.validateToken(token)) {
            filterChain.doFilter(request, response);
        } else {
            // 如果 Token 不合法，返回错误响应
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid Token");
        }
    }

    private boolean validateToken(String token) {
        try {
            String userInfoJson = new String(Base64.getDecoder().decode(token));
            UserPo userPo = JSONObject.parseObject(userInfoJson, UserPo.class);
            this.setRoleAuthorityToRedis(userPo);
            String checkToken = redisTemplate.opsForValue().get("user:" + userPo.getId());
            return checkToken != null && checkToken.equals(token);
        } catch (Exception e) {
            return false;
        }
    }

    public void setRoleAuthorityToRedis(UserPo userPo) {
        UserContext.setUser(JSONObject.parseObject(JSONObject.toJSONString(userPo)));

        String userRoleCode = redisTemplate.opsForValue().get("userRoleCode:" + userPo.getId());
        UserContext.setUserRole(userRoleCode);
        List<String> userRoleList = UserContext.getUserRole();
        userRoleList.forEach(role -> {
            String roleCodeAndId = role + ":" + userPo.getId();
            String menuCode = redisTemplate.opsForValue().get("menu:" + roleCodeAndId);
            UserContext.setUserMenu(menuCode);
            String interfaceCode = redisTemplate.opsForValue().get("interface:" + roleCodeAndId);
            UserContext.setUserInterface(interfaceCode);
            String tableCode = redisTemplate.opsForValue().get("table:" + roleCodeAndId);
            UserContext.setUserTable(tableCode);
            String formCode = redisTemplate.opsForValue().get("form:" + roleCodeAndId);
            UserContext.setUserForm(formCode);
            String buttonCode = redisTemplate.opsForValue().get("button:" + roleCodeAndId);
            UserContext.setUserButton(buttonCode);
        });
    }

}
