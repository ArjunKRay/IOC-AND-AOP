package rgpv;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable

@ComponentScan("rgpv")
@PropertySource("classpath:college-info.properties")

public class CollegeConfig {

	
	/*
	 
@Bean	 
	 public Teacher mathTeacherBean() {
		 
		 
		 return new MathTeacher();
	 }
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean 
	public College collegeBean()
	{
		
	College college = new College();
	
	college.setPrincipal(principalBean());
	college.setTeacher(mathTeacherBean());
	
	
	
	return college;
	}
	*/
	
}
