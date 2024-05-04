package com.yyzy.crm.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect2 {

    // 定义切入点表达式
    @Pointcut("execution(* com.yyzy.crm.UserDao.*(..))")
    private void myPointCut() {}

    // 前置通知
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.print("----前置通知----");
    }

    // 后置通知
    @AfterReturning("myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.print("----后置通知----");
    }

    // 环绕通知
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-----环绕开始------");
        // 执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();
        // 结束
        System.out.println("-----环绕结束-----");
        return obj;
    }

    // 异常通知
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知：" + "出错了" + e.getMessage());
    }

    // 最终通知
    @After("myPointCut()")
    public void myAfter() {
        System.out.println("----最终通知----");
    }
}
