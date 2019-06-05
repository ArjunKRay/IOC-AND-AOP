package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiringbeans.xml");
Human hm = context.getBean("human", Human.class);
 hm.heartpumping();
	}

}
