package Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Car {

	public static void main(String[] args) {
		
		
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
//ApplicationContext context= new ClassPathXmlApplicationContext("objbeans.xml");

CarParts c= context.getBean("carParts",CarParts.class);
System.out.println(c.tyres);

	}

}
