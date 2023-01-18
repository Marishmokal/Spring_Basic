package pro.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("RefConfig.xml");
	A a=(A) context.getBean("aref");
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	System.out.println(a);
	
}
}
