package springconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("beanscontructor.xml");
		
		 Car c= context.getBean("car",Car.class);
		 
		 c.displayCarInfo();
	}

}
