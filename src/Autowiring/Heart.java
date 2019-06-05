package Autowiring;

public class Heart {
	
	private String nameOfHeart;
	private int noOfHeart;
	
	
	public String getNameOfHeart() {
		return nameOfHeart;
	}

	public void setNameOfHeart(String nameOfHeart) {
		this.nameOfHeart = nameOfHeart ;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	
	
	public void pumping () {
		System.out.println("heart is pumping");
		
	}

}
