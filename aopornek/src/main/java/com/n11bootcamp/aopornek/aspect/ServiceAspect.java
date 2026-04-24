package com.n11bootcamp.aopornek.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {


    @Before("execution(* com.n11bootcamp.aopornek.service.MessageService.giveMessage(..))")
    //@Before("execution(* com.promet.aopornek.service.MessageService.giveMessage(..))")
    public void BeforeTheMessageSendMethod(JoinPoint joinPoint)
    {
        System.out.println("GiveMessage parameter called before the method"+joinPoint.getArgs()[0]);
    }

    @After("execution(* com.n11bootcamp.aopornek.service.*.*(..))")
    public void AfterTheMessageSendMethod(JoinPoint joinPoint)
    {
        System.out.println("GiveMessage the parameter passed to the method"+joinPoint.getArgs()[0]);
    }

    @AfterReturning(pointcut = "execution(* com.n11bootcamp.aopornek.service.MessageService.giveMessage(..))",
            returning="retVal")
    public void AfterReturnedValueFromTheMessageSendMethod(Object retVal) {
        System.out.println("giveMessage after the method returns a value "+retVal);
    }


}