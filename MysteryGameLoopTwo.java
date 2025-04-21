// MysteryGameLoopTwo.java

import java.util.Scanner;

public class MysteryGameLoopTwo {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int random = (int) (Math.random() * 11);
	
	int counter = 0;
	int counterValue = 3353535;
	int guessCount = 0; 

	while(counter != counterValue) {
	System.out.print("Please enter a guess number ");

	int guess = input.nextInt();
	guessCount ++;
	if( guess == random) {
	System.out.println("Congratulations!!!!" + " " + "Number of Guesses: " + guessCount);
	break;
	}

	if (guess != random && guess < random) {
	System.out.printf("Error! Number too low!. %n");
	}

	if (guess != random && guess > random) {
	System.out.printf("Error! Number too high!. %n");
	}

	counter = counter + 1;
}
}
}
	