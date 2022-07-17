import java.util.Scanner;

/*
 * Student Name: Anton Pushkarev
 * Lab Professor: Professor Gustavo Adami
 * Due Date: July 22, 2022
 * Modified: July 15, 2022
 * Version 1.1
 * Description: CST8116_321 Assignment 2
 *  */

public class Assignment02 {
	//private Scanner Scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		/* create a PotatoChipBag using initial constructor */
		PotatoChipBag PotatoChipBag = new PotatoChipBag();
		User user = new User();
		// double num = user.
		int badBag = 0;
		int goodBag = 0;
		int totalBags = 0;
		String continu = "yes";
				
		do {
			/* change values based on user input. Input size of a bag */	
			
			PotatoChipBag.size =   user.inputValSize();
			
			if (PotatoChipBag.size != 1 && PotatoChipBag.size != 2)
			/*checking correction input of type of a bag. */
			/*If True then it mean that user inputs not 1 or 2*/ 
			{
				System.out.printf("invalid bag size entered %n");
				System.out.println("\nProgram implemented by Anton Pushkarev");
			} 
			else {
				/* Input weight of bag */	
				PotatoChipBag.weight =   user.inputValWeight();
					if (PotatoChipBag.isBagCorrectWeight())
					
					{
					badBag = badBag + 1;
					}
					else {
					goodBag = goodBag +1;
					}
				totalBags = goodBag + badBag; /* Calculate total bags */
				System.out.println("Good bags : " + goodBag); /* bag weight is the same or 0.01 oz different or less from the expected weight */ 
				System.out.println("Bad bags :  " + badBag); /* bag weight is 0.01 oz different or more from the expected weight */
				System.out.println("Total bags :  " + totalBags); /* total number of bags */
				System.out.println("\nProgram implemented by Anton Pushkarev");
			}
			
			//PotatoChipBag.inputContinue(null);
			//PotatoChipBag.continu = user.inputValContinue(null);
			Scanner input = new Scanner( System.in );
			System.out.println("Continue Program? (yes - Enter yes/no - Enter no)");
			continu = input.nextLine();
			
			} while (continu.equalsIgnoreCase("yes"));
		System.out.println("Program has shut down");
						
			
	
	}

}