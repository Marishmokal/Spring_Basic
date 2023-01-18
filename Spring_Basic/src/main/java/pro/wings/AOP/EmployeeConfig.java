package pro.wings.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@ComponentScan
@EnableAspectJAutoProxy
public class EmployeeConfig {

}
