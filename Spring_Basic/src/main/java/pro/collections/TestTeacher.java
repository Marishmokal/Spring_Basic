package pro.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeacher {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("TeacherConfig.xml");
	Teacher t=(Teacher) context.getBean("teacher1");
	System.out.println(t.getName());
	System.out.println(t.getPhones());
	System.out.println(t.getAddreses());
	System.out.println(t.getCourses());
	System.out.println(t.getProps());
} 
}
