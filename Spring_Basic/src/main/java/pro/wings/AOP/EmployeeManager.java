package pro.wings.AOP;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

	public Employee getEmployeeById(Integer employeeId)
	{
		System.out.println("get Employee By id");
//		if(true)
//			throw new NullPointerException();
		return new Employee(20,"vaibhav");
	}
	
}
