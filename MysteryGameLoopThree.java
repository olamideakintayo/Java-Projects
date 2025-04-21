// MysteryGameLoopThree.java

import java.util.Scanner;

public class MysteryGameLoopThree {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int random = (int) (Math.random() * 11);
	
	
	int guessCount = 0; 
	int inCorrectGuesses = 0;

	for (int counter = 0; counter != 3353535; counter ++) {
	System.out.printf("Please enter a guess number: %n");

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

	inCorrectGuesses ++;
	if (inCorrectGuesses % 3 == 0) {
	System.out.printf("The Mystery Number has been changed! %n");
	random = (int) (Math.random() * 11);
	}

	
}
}
}
	