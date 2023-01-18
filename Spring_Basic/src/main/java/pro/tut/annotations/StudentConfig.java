package pro.tut.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "pro.tut.annotations")
@PropertySource("classpath:db.properties")
public class StudentConfig {
	
	@Autowired
	Environment env;
	
	@Bean(name="currentAddress")
	@Primary
	public Address getAddress1()
	{
		return new Address(123,"Kolkata");
		
	}
	@Bean(name="permanantAddress")
	public Address getAddress2()
	{
		return new Address(321,"pune");
	}
	
	@Bean
	public DbProps getProps()
	{
		DbProps d=new DbProps();
		d.setUser(env.getProperty("db.url"));
		d.setUrl(env.getProperty("db.user"));
		d.setPwd(env.getProperty("db.password"));
		return d;
	}
}
