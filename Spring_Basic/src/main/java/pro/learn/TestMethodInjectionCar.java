package pro.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjectionCar {
public static void main(String[] args) {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("CarApplicationContext.xml");
	
	Car car=ctx.getBean("Car",Car.class);
	System.out.println(car.getEngine());
	System.out.println(car);
	
}
}
