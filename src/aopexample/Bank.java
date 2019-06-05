package aopexample;
public class Bank {
	
	int amt = 10000;
	String ac= "sbi123";
	
	public int deposite(int amt, String ac){
		
	if (ac.equals(this.ac))	
	{
	 return this.amt=this.amt+amt;
			
	}
	else {
		throw new AcNotFountException();
		
		
	}		
	
	
	}
			
			

}
