package Tic_Tac_Toe;

import java.util.Scanner;

public class Utility {

	/**
	* Scanner which can parse primitive types and strings
	*/
	private static final Scanner sc = new Scanner(System.in);
	/**
	* Scanning of User input which is integer type
	* @return assigned character value
	*/
	public static char getUserChar() {
	return sc.next().charAt(0);
	}

//	public static int getUserInteger() {
//	return sc.nextInt();
//	}
			
}
