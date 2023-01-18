package pro.depenon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Name {
	String name;
	@Autowired
	private SecondName secondName;
	@Autowired
	private Surname surname;

	public Name() {
		System.out.println("Name constructer initialized");
	}
	public void fullName()
	{
		secondName.showName();
		surname.showName();
	}
}
