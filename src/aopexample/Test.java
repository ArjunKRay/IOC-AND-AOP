
package aopexample;
import org.springframework.aop.framework.ProxyFactoryBean;


 class Test {

	public static void main(String[] args) {
		
    Bank b = new Bank ();// create the target 
    
    // create the service 
	ServiceBefore sf = new ServiceBefore();
	
	 ProxyFactoryBean pfb = new ProxyFactoryBean();
	 
	 
	 pfb.setTarget(b);
	 
	 pfb.addAdvice(sf);
	 Bank bproxy =(Bank)pfb.getObject();
	 int amt = bproxy.deposite(10000, "sbi123");
	 System.out.println(amt);       
	}

}
