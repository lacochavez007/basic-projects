package mypackage;

import java.awt.Point;
import java.util.Arrays;
import java.util.Random;

/**
 * @author mu
 *
 */
public class MySecondClass {
	double result = 2.3 +4.5;
	String result1 = "Hello, "+"World";
	String result2 = "Number" + 5;
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	public static int maxInt(int myInt1,int myInt2) {
		System.out.println("^^^^^ START maxInt ^^^^^");
		System.out.println("^^^^^ vars is "+ myInt1 + " , " + myInt2 +" ^^^^^");
		
		if ( myInt1 <= myInt2 ) {
			return myInt2;
		}
		else {
			return myInt1;
		}
		
	}
	
	public static boolean printIntArray(int[] myIntArray) {
		int cnt =1;
		System.out.println("****** START printIntArray ********");
		for (int myInt: myIntArray) {
			System.out.println("printIntArray val is:"+myInt+" cnt is:"+cnt);
			cnt++;
		}
		System.out.println("****** END printIntArray ********");
		return true;
	}
	
	
	public static boolean printStringArray(String[] myStringArray) {
		int cnt =1;
		System.out.println("±±±±±± START printStringArray ±±±±±±");
	
		for (String myString: myStringArray) {
			System.out.println("printStringArray val is:"+myString+" cnt is:"+cnt);
			cnt++;
		}
		System.out.println("±±±±±± END printStringArray ±±±±±±");
		return true;
	}
	
	public static boolean populateRandomStringArray(String[] myStringArray) {
		System.out.println("±±±±±± START populateRandomStringArray ±±±±±±");
		int alphabetNum = 0;
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		for ( int cnt =0 ; cnt < myStringArray.length;cnt++) {
			alphabetNum = (int) ( Math.random() * 10 ); 
			myStringArray[cnt] = Character.toString( alphabet[alphabetNum] );
			System.out.println("populateRandomStringArray val is:"+myStringArray[cnt]+" cnt is:"+cnt);

		}
		System.out.println("±±±±±± END populateRandomStringArray ±±±±±±");
		return true;
	
	}

	public static boolean populateRandomIntArray(int[] myIntArray) {
		System.out.println("****** START populateRandomIntArray ********");
		for ( int cnt =0 ; cnt < myIntArray.length;cnt++) {
			myIntArray[cnt] = (int) ( Math.random() * 10 ); 
			System.out.println("populateRandomIntArray val is:"+ myIntArray[cnt]  +" cnt is:"+cnt);
	
		}
	
		System.out.println("****** END populateRandomIntArray ********");
		return true;
	}
	
	public static void main(String[] args) {
	System.out.println("This is a code in a package");
	System.out.println("number of args is "+ args.toString());
	int[] nums = { 2,4,6,8 };
	String[] names = {"John","Tim","Darcy"};
	
	Point[] points = {
				new Point(0,0),
				new Point(1,2),
				new Point(3,4)
				
	};
	
	
	// two step array process where creation and assignment of value are two different stages.
	int[] primes = new int[7]; // create for 7 integers but they all are defaulted to zero
	String[] myNames = new String[13]; // create space for 13 strings but they all are null
	
	// mutlidimensional arrays
	// java does not have multi dim arrays but it has arrays of arrays which means the sub arrays can be of different sizes
	int[][] myTwoArrays = {
			{2,4},
			{6,8,9},
			{3}
	};
	
	int[][] myTwoIntArrayAllocAfter = new int[10][5];
		myTwoIntArrayAllocAfter[1][1] = 2;
		myTwoIntArrayAllocAfter[1][2] = 4;
		
		
	
	String[][] myTwoStringArrays = {
			{ "Happy","tappy"},
			{"Jenny"},
			{"Tom","Harry","Richard"}
	};
	
	String[][] myTwoStringArraysAfterAlloc = new String[5][7];
	myTwoStringArraysAfterAlloc[1][1] = "afas";
	
	
	
	/////
	System.out.println("prime count is"+primes.length);

	int cnt =1;
	
	System.out.println(primes.toString());
	
	printIntArray(primes);
	populateRandomIntArray(primes);
	printIntArray(primes); // print array after population

	 cnt =1;
	 printStringArray(myNames);
	 populateRandomStringArray(myNames);
	 printStringArray(myNames);
 
	 System.out.println("ret from maxInt " + maxInt(2,8) );
	
	// LOOPS  ///
	System.out.println("using string static method for names:" +String.valueOf(1334));
	
	for (String name: names) {
		System.out.println("for () the value of array " + cnt + " name is " + name);
		cnt++;
		//System.out.println("cnt val is"+cnt);

		switch(name) {
			case "John" : System.out.println("switch() hello John"); break;
			case "Tim"	: System.out.println("switch() hello Tim"); break;
			default : System.out.println("Hello , you must be new here , it's nice to meet you " +name );
		}
		
		if ( name.contains("J") ) {
			 System.out.println("hi I found a J in name ");
		}

		if ( name.contains("T") ) {
			 System.out.println("hi I found a T in name "); 
		}

	}
	
	for(int i=0 ; i< nums.length ;i++ ) {
		System.out.println("for(;;) the num value is:"+nums[i]+ "for array num:"+i);
	}
	
	cnt =0;
	while( cnt < names.length) {
		System.out.println("while() the value of array " + cnt + " name is " + names[cnt]);
		cnt++;
		
	}
	// in && if first is false the next condition wont be checked
	if( nums!=null && nums.length > 1 ) {
		cnt=0;
		do {
			System.out.println("do-while() the value of array " + cnt + " name is " + nums[cnt]);
			cnt++;
			
		}while(cnt < nums.length);
	}
	else {
		System.out.println("nums array is empty");
	}
	

/*	System.out.println(names.value());
	System.out.println("nums arrays is " + nums.toString());
	nums[0] = 2;
	nums	[3]= 8;	
*/	
	}
	
	
}
