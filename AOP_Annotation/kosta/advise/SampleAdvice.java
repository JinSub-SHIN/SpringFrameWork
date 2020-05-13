package kosta.advise;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("sampleAdvice")
@Aspect
public class SampleAdvice {

	/*
	 *  before : 사전처리
	 */
	@Pointcut("execution(public * kosta.service.*Impl.*(..))")
	public void pointCut() {}
	
	
	//@Around("pointCut()") -> 사전/사후 처리가 있는 곳에서 사용함.
	@Before("pointCut()")
	public void before(JoinPoint joinPoint) {
		
		System.out.println("before 호출되었습니다...");
		String methodName = joinPoint.getSignature().getName();
		Object [] params = joinPoint.getArgs();
		
		System.out.println(methodName+"의 인수의 개수 : " + params.length);
		for(Object o : params) {
			System.out.println(methodName+"의 인수의 값 : " + o);
		}
		
		System.out.println(methodName+"호출되기전 before....\n");
	}
		
	/*
	 *  after : 사후처리
	 */
	@After("pointCut()")
	public void afterFinally() {
		System.out.println("afterFinally() 예외 발생여부 상관없이 호출됩니다..\n");
	}
	
	/*
	 *  after-returning : 예외가 없이 정상적으로 동작했을때 사후처리
	 */
	@AfterReturning(pointcut="pointCut()", returning="obj")
	public void afterReturning(JoinPoint joinPoint, Object obj) {		
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println(methodName+"의 리턴값 : " + obj);
		System.out.println("afterReturning() 정상동작했습니다(사후처리)\n");
	}
	
	
	/*
	 * after-throwing : 예외가 발생했을떄 사후처리..
	 */
	@AfterThrowing(pointcut="pointCut()", throwing = "e")
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing 예외가 발생한 후 처리.... e : " + e + "\n");
	}
	
	
	
	
	
	
	
	
	
}
