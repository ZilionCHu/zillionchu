package com.github.zilionchu.test.zilionchutest.zExample.apiUnique;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 10:05
 * @Description:
 */
public class TestAOp {

    /**
     public BpsAssistInfoOprationLogRecordHandle() {
     }

     @Pointcut("execution(public * com.fotic.bpsclient.service.extend..*.*(..))")
     public void assistInfoPointcut() {
     }

     @Around("assistInfoPointcut()") public Object handleMethodException(ProceedingJoinPoint joinPoint) {
     String className = joinPoint.getSignature().getDeclaringTypeName();
     String methedName = joinPoint.getSignature().getName();
     log.info("操作工作流辅助信息表, 调用方法名称 : {}.{}", className, methedName);
     if(joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
     log.info("操作工作流辅助信息表, 参数 : ");
     Arrays.asList(joinPoint.getArgs()).forEach((param) -> {
     log.info("参数 : {}", param);
     });
     }

     try {
     Object obj = joinPoint.proceed();
     log.info("操作工作流辅助信息表, 调用结果 : {}", obj);
     return obj;
     } catch (Throwable var5) {
     log.error("操作工作流辅助信息表异常, 调用方法名称 : {}.{}", className, methedName);
     if(joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
     log.error("操作工作流辅助信息表异常, 参数 : ");
     Arrays.asList(joinPoint.getArgs()).forEach((param) -> {
     log.error("参数 : {}", param);
     });
     }

     log.error("操作工作流辅助信息表异常, 具体信息 : {} ", var5);
     throw new WFException("D00001", "操作工作流辅助信息表异常", var5);
     }
     }
     */


}
