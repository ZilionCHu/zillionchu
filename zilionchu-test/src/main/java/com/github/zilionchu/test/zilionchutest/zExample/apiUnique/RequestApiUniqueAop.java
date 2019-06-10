package com.github.zilionchu.test.zilionchutest.zExample.apiUnique;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-10 11:16
 * @Description:
 */
@Aspect
@Component
//@Slf4j
public class RequestApiUniqueAop {
    private static Logger logger = LoggerFactory.getLogger(RequestApiUniqueAop.class);

    private static final String REQUEST_HEAD = "head";
    private static final String REQUEST_FROM = "from";
    private static final String REQUEST_TOKEN = "token";


    @Pointcut(value = "execution(public * com.github.zilionchu.test.zilionchutest.zExample.apiUnique.controller.*.*" +
            "(..))")
    public void uniqueAop() {

    }

    @Before("uniqueAop()")
    public void beforeUniqueAop(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        RequestApiUniqueToken requestApiUniqueToken = signature.getMethod().getDeclaredAnnotation
                (RequestApiUniqueToken.class);
        if (requestApiUniqueToken != null) {
            // 可以放入到AOP代码 前置通知
            System.out.println("Console out into aspect  before and  get  token...");
            logger.debug("into aspect  before and  get  token...");
            getRequest().setAttribute("token", UUID.randomUUID() + "zillion");
        }
    }

    @Around("uniqueAop()")
    public Object aroudBeforeAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        RequestApiUnique requestApiUnique = methodSignature.getMethod().getDeclaredAnnotation(RequestApiUnique.class);
        if (requestApiUnique != null) {
            String type = requestApiUnique.type();
            String token = null;
            HttpServletRequest request = getRequest();
            if (type.equals(REQUEST_HEAD)) {
                token = request.getHeader(REQUEST_TOKEN);
            } else {
                token = request.getParameter(REQUEST_TOKEN);
            }
            if (StringUtils.isEmpty(token)) {

                return "token is null";
            }
            boolean checkToken = TokenUtil.checkToken(token);

            if (!checkToken) {
                response("API is Unique");

                return null;
            }

        }
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }

    public HttpServletRequest getRequest() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        return request;

    }

    public void response(String msg) throws IOException {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = attributes.getResponse();
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            writer.println(msg);
        } catch (Exception e) {

        } finally {
            writer.close();
        }

    }


}
