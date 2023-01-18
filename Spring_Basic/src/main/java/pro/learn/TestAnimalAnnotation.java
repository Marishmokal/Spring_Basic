package pro.learn;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimalAnnotation {
public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("AnimalAnnotations.xml");

		Animal a1 = ctx.getBean("animal", Animal.class);
		
		System.out.println(a1);
		
		ctx.close();
		
}
}
