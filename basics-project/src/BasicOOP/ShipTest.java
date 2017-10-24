package BasicOOP;

public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship s1 = new Ship("ship one");
		Ship s2 = new Ship("ship two");
		
		s2.setDirection(135);
		s2.setSpeed(2);
		
		s1.move();
		s2.move();
		
		s1.printLocation();
		s2.printLocation();
		
		
		
	}

}
