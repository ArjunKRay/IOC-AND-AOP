
package aopexample;




import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.BeforeAdvice;


public class ServiceBefore implements BeforeAdvice { 
	
	public void before(Method m, Object[] para, Object o) {
		
	Log l= LogFactory.getLog(Bank.class);
	
	l.info("depodite methode");
		
	}

}
