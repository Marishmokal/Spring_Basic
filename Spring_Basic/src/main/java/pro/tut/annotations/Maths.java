package pro.tut.annotations;

import org.springframework.stereotype.Component;

@Component
public class Maths implements Subject {

	public void printSubjectInfo() {
		System.out.println("This is maths");
		
	}

}
