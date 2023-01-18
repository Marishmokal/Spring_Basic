package pro.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructerAmbiguity {
public static void main(String[] args) {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("ConstructerAmbiguity.xml");
	
	AmbiguityConstructer c=ctx.getBean("obj",AmbiguityConstructer.class);
	
}
}
