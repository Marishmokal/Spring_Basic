package pro.learn;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String[] args) {

		// instantiate container

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s1 = ctx.getBean("std1",Student.class);

		System.out.println(s1);
		
		
		Properties p=ctx.getBean("myConfiguration",Properties.class);
		System.out.println(p);
		
//
//		Student s2 =ctx.getBean("std2",Student.class);
//
//		System.out.println(s2);
//		
		

		

	}
}
