import java.util.Scanner;

/*
 * Student Name: Anton Pushkarev
 * Lab Professor: Professor Gustavo Adami
 * Due Date: July 22, 2022
 * Modified: July 15, 2022
 * Version 1.1
 * Description: CST8116_321 Assignment 2
 *  */

//??import java.util.Scanner;
public class PotatoChipBag {
	public int size; // Regular or Large (use constants below)
	public double weight; // oz
	private static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75;
	public static final double EPSILON = 0.01;
	public double tolerance;
	
	/* declaring default constructor */
	public PotatoChipBag() {
		this.size = REGULAR;
		this.weight = REGULAR_WEIGHT;
		//this.continu = "yes";
		this.tolerance = 0;
	}
	
	/* initial constructor */
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}
	
	/* accessor for size */
	public int getSize() {
		return size;
	}
	
	/* mutator for size */
	public void setSize(int size) {
		this.size = size;
	}
	
	/* accessor for weight */
	public double getWeight() {
		return weight;
	}
	
	/* mutator for wieght */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/* accessor for tolerance */
	public double getTolerance() {
		return tolerance;
	}
						
	/* mutator for tolerance */
	public void setTolerance(double tolerance) {
		this.tolerance = tolerance;
	}
	
	public boolean isBagCorrectWeight(){
		boolean result = false;
		switch(this.size) {
		/* Display results which depend on user choice (size)	*/
			case 1: //user enter 1. Checking of regular bags
				this.tolerance = Math.abs(this.weight - REGULAR_WEIGHT) - EPSILON;
				if (this.tolerance > 0)result = true;
				break;
			case 2: //user enter 2. Checking of large bags
				this.tolerance = Math.abs(this.weight - LARGE_WEIGHT) - EPSILON;
				if (this.tolerance > 0)
				break;
		}
		return result;
	}
	
	
}

	
	

