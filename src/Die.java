import java.util.Random;

public class Die {
	
	private int dieNum;
	private Random rand;
	
	
	public Die() {
		
		dieNum = (int) (Math.random()*6) + 1;
		rand = new Random();
		
		
	}


	public int getDieNum() {
		return dieNum;
	}


	public void roll() {
		dieNum = rand.nextInt(6) +1;
	}

}
