/*
 * Student Name: Anton Pushkarev
 * Lab Professor: Professor Gustavo Adami
 * Due Date: July 22, 2022
 * Modified: July 15, 2022
 * Version 1.1
 * Description: CST8116_321 Assignment 2
 *  */

import java.util.Scanner;

/* Input of user values */

public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/* Input of type of bag size */
	
	public int inputValSize() {
	System.out.println("Enter what type of bag size");
	System.out.println ("1 - Regular at 9.25 oz");
	System.out.println ("2 - Large at 15.75 oz");
	int valSize = keyboard.nextInt();
	return valSize;
	}
	
	/* Input weight of bag */
	public double inputValWeight() {
		System.out.println( "Enter weight in oz");
		double valWeight = keyboard.nextDouble();
		return valWeight;	
	}
	
	/* Input option for continue */
	public String inputValContinue(String message) {
		System.out.println("Continue Program? (yes - Enter yes/no - Enter no)");
		String valContinue = keyboard.nextLine();
		return valContinue;
		
	}
	
}