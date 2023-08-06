package gg.borro.mongo.learn.mongol.security.config;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

@Aspect
@Component
public class WorkAccessAspect {

    @Pointcut("@annotation(WorkAccess)")
    private void WorkAccessAspectSecurityAnnotation() {
    }

    @Around("WorkAccessAspect.WorkAccessAspectSecurityAnnotation()")
    public Object doSomething(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest req = Optional.of(getRequestAttributes().getRequest())
                .orElseThrow(() -> new AccessDeniedException("Amazing you are here!!!"));
        System.out.println("Keep going...");
        return pjp.proceed();
    }

    private ServletRequestAttributes getRequestAttributes() {
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }
}
