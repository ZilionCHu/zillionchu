//package com.github.zillionchu.sso.zillionchusso.config;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @Auther: ZiLlionChu
// * @Date: 2019/2/12 14:18
// * @Description:
// *
// * implements HandlerInterceptor
// */
//@Component
//public class JwtInterceptor  implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                             Object o) throws Exception {
//
//        System.out.println("拦截到了");
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
//                           ModelAndView modelAndView) throws Exception {
//
//
//        System.out.println("1");
//
//
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        System.out.println("2");
//    }
//
//
//}
