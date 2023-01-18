package pro.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonContainer {
public static void main(String[] args) {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("PersonContext.xml");
	
	Person p=ctx.getBean("person",Person.class);
	System.out.println(p);
}
}
