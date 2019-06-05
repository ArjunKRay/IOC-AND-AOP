package emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Empbeans.xml");
		
Misscall mc = context.getBean("misscall",Misscall.class);
		
	mc.service();	
	}

}
