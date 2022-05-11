import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		int sumInts = 0;
		 
		try {
			if( a > 0 && b > 0) {
				sumInts = a + b;
			} else throw new IllegalArgumentException("Both parameters must be positive! ");
		} catch(IllegalArgumentException e) {
			
			System.err.println(e);
			throw new IllegalArgumentException("Both parameters must be positive! ");
		}
		return sumInts;
		
	}
	
	
	
	public int randomNumberSquared() {
		int randomInt = getRandomInt();
		return randomInt * randomInt;
		
	}
	
	public int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}

}
