package kosta.advise;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("aroundAdvice")
@Aspect
public class AroundAdvice {

	/*
	 * 사전, 사후처리..
	 *  @param : ProceedingJoinPoint
	 *  @return : Object 
	 */
	@Pointcut("execution(public * kosta.service.*Impl.*(..))")
	public void pointCut() {}
	
	
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
				
		//사전처리
		System.out.println("around의 사전 처리 중입니다...\n");
		joinPoint.getSignature().getName();
		
		Object obj = joinPoint.proceed();
		System.out.println("around의 사후 처리 중입니다...\n");
				
		//사후처리
		return obj;
	}
}
