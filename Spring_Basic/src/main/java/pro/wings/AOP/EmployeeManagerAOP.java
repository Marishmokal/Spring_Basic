package pro.wings.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class EmployeeManagerAOP {
	@Before("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog1() {
		System.out.println("logging information before");
	}
	@After("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog2() {
		System.out.println("logging information after..");
	}
	@AfterReturning("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog3() {
		System.out.println("logging information afterreturning...");
	}
//	@AfterThrowing("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog4() {
//		System.out.println("logging information afterthrowing...");
//	}
	@Around("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog5(ProceedingJoinPoint pjp) throws Throwable{
		int i=(Integer)pjp.getArgs()[0];
		System.out.println("logging information around..."+i);
		pjp.proceed();
		System.out.println(i);
	}
	

}
