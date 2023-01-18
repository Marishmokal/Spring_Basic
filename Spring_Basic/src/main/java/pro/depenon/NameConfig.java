package pro.depenon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class NameConfig {

	@Bean("Name")
	@DependsOn(value= {"SecondName","Surname"})
	public Name getName() {
		return new Name();
	}
	@Bean("SecondName")
	public SecondName getSecondName() {
		return new SecondName();
	}
	@Bean("Surname")
	public Surname getSurname() {
		return new Surname();
	}
}
