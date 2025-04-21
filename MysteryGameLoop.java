// MysteryGameLoop.java

import java.util.Scanner;

public class MysteryGameLoop {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int random = (int) (Math.random() * 11);
	
	int counter = 0;

	while(counter != 3) {
	System.out.print("Please enter guess number " + (counter + 1) + ":");

	int guess = input.nextInt();
	if( guess == random) {
	System.out.println("Correct!! You got the same number as the computer" + " " + random);
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
	