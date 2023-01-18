package pro.depenon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppName {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
	ctx.register(NameConfig.class);
	ctx.refresh();
	Name n=ctx.getBean(Name.class);
	n.fullName();

	System.out.println(n);
}
}
