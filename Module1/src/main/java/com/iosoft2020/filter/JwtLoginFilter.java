//package com.iosoft2020.filter;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.example.SpringSecurity_jwt_rsa.common.JwtUtils;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.iosoft2020.entity.SysRole;
//import com.iosoft2020.entity.SysUser;
//
//public class JwtLoginFilter extends UsernamePasswordAuthenticationFilter {
//
//    private AuthenticationManager authenticationManager;
//
//    public JwtLoginFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    //重写springsecurity获取用户名和密码操作
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//            throws AuthenticationException {
//        try {
//            //从输入流中获取用户名和密码，而不是表单
//            SysUser sysUser = new ObjectMapper().readValue(request.getInputStream(), SysUser.class);
//            UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
//                    sysUser.getUsername(), sysUser.getPassword());
//            return authenticationManager.authenticate(authRequest);
//        } catch (Exception e) {
//            try {
//                //处理失败请求
//                response.setContentType("application/json;charset=utf-8");
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                PrintWriter out = response.getWriter();
//                Map map = new HashMap<>();
//                map.put("code", HttpServletResponse.SC_UNAUTHORIZED);
//                map.put("msg", "用户名或者密码错误");
//                out.write(new ObjectMapper().writeValueAsString(map));
//                out.flush();
//                out.close();
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//
//            throw new RuntimeException(e);
//        }
//    }
//
//    //重写用户名密码授权成功操作----返回token凭证
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
//            Authentication authResult) throws IOException, ServletException {
//        //从authResult获取认证成功的用户信息
//        SysUser resultUser = new SysUser();
//        SysUser authUser = (SysUser) authResult.getPrincipal();
//        resultUser.setUsername(authUser.getUsername());
//        resultUser.setUid(authUser.getUid());
//        resultUser.setStatus(authUser.getStatus());
//        resultUser.setRoles((List<SysRole>) authResult.getAuthorities());
//        String token = JwtUtils.generateTokenExpireInMinutes(resultUser, prop.getPrivateKey(), 3600 * 24);
//        //将token写入header
//        response.addHeader("Authorization", "Bearer " + token);
//        try {
//            //登录成功時，返回json格式进行提示
//            response.setContentType("application/json;charset=utf-8");
//            response.setStatus(HttpServletResponse.SC_OK);
//            PrintWriter out = response.getWriter();
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("code", HttpServletResponse.SC_OK);
//            map.put("message", "登陆成功！");
//            out.write(new ObjectMapper().writeValueAsString(map));
//            out.flush();
//            out.close();
//        } catch (Exception e1) {
//            e1.printStackTrace();
//        }
//    }
//}