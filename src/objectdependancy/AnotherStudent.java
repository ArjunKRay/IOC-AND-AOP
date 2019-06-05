package objectdependancy;

public class AnotherStudent {
	
	private Mathcheat cheat;

	public void setCheat(Mathcheat cheat) {
		this.cheat = cheat;
	}
  public void shareCheat() {
	   cheat.mathcheating();
  }
}
