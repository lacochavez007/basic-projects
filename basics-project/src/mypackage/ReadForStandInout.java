package mypackage;

import java.util.Scanner;
/*
 * LEARNING MODERN JAVA: A CRASH COURSE USING JAVA 8
 * 
 * 	publisher logo Learning Modern Java: A Crash Course Using Java 8
 *	by Marty Hall
 *	Published by Addison-Wesley Professional, 2015
 */
public class ReadForStandInout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length >= 1 ) {
			System.out.println(args);
		}
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		System.out.println("the val is : "+n);
		inputScanner.close();
		
	}

}
