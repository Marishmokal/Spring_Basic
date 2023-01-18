package pro.wings.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(EmployeeConfig.class);
		ctx.refresh();
		EmployeeManager e=ctx.getBean(EmployeeManager.class);
		e.getEmployeeById(20);
	}
}
