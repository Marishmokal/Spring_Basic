package pro.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeContainer2 {
	public static void main(String[] args) {

		// instantiate container

		ApplicationContext ctx = new ClassPathXmlApplicationContext("EmployeeApplicationContext.xml");
		
		Employee e1= ctx.getBean("emp", Employee.class);
		System.out.println(e1); 

	

		

	}
}
