package pro.learn;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {
public static void main(String[] args) {
	
	
	ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("VehicleContext.xml");
	
	Vehicle v=ctx.getBean("vehicle",Vehicle.class);
	System.out.println(v);
	ctx.close();
}
}
