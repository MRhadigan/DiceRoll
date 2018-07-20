import java.util.Random;
import java.util.Scanner;

public class diceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// Asking for user input, and scanning in user input
		System.out.println("Please enter the number of sides on the dice you are about to throw: ");
		int diceSides = scan.nextInt();
		scan.nextLine();
		
		String cont;
		// a do loop to roll the dice and get the random number from the method
		do {
		System.out.println("Rolling Dice!");
		int num1 = rollDice(diceSides);
		int num2 = rollDice(diceSides);
		System.out.println("" + num1 + " " + num2);
		special(num1, num2);
		
		// asking if user wants to continue, and stoping in they say anything other than "y"
		System.out.println("Continue? (y/n)");
		cont = scan.nextLine();
		
		} while (cont.equalsIgnoreCase("y"));
			System.out.println("Goodbye!");
		
	}

	// A method to get the random number of each dice
	private static int rollDice(int diceSides) {
		Random rand = new Random();
		int randomSide = rand.nextInt(diceSides);
		return randomSide + 1;
	  
	}
	
	// A method to get specific outputs for specific rolls of the dice
	private static void special(int num1, int num2) {
		if (num1 == 1 && num2 == 1) {
			System.out.println("Snake Eyes");
		} else if (num1 == 6 && num2 == 6) {
			System.out.println("Boxcar");
		} else if (num1 + num2 == 7 || num1 + num2 == 11) {
			System.out.println("Craps!");
		} 
		
	
			
		
	}  
		
}

