package mypackage;

public class MathsTestClass {

	public static void printVar(int x,int y,int z) {
		System.out.println("-------------");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		System.out.println("-------------");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7,y=2;
		int z= x%y;
		System.out.println("x mod y");
		printVar(x,y,z);
		z=x++;
		System.out.println("z=x++");
		printVar(x,y,z);
		z=++x;
		System.out.println("z=++x");
		printVar(x,y,z);
		
		double eight = Math.pow(2, 3);
		double almostzero = Math.sin(Math.PI);
		double randomNum = Math.random();
		
		// Double.POSITIVE_INFINITY is 1.0 /0.0
		// Double.NEGATIVE_INFINITY is -1.0/0.0
		// Double.NaN is not a number 0.0d/0.0
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

	}

}
