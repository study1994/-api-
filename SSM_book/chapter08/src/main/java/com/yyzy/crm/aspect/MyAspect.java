package com.yyzy.crm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    // 前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("----前置通知----");
    }

    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("----后置通知----");
    }

    // 环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-----环绕开始------");
        // 执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();
        // 结束
        System.out.println("-----环绕结束-----");
        return obj;
    }

    // 异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知：" + "出错了" + e.getMessage());
    }

    // 最终通知
    public void myAfter() {
        System.out.println("----最终通知----");
    }
}

