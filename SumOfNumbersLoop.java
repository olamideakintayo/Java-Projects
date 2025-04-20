// SumOfNumbersLoop.java

import java.util.Scanner;

public class SumOfNumbersLoop {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	String continueAgain;
	do {
	int counter = 0;
	int sum = 0;
	
	while(counter < 2) {
	System.out.print("Please Enter Integer Number " + (counter + 1) + ":");
	int num = input.nextInt();
	sum = num + sum;
	counter ++;
	}
	System.out.printf("The sum of the integer is %d%n", sum);
        
	System.out.print("Do you wish to continue? Press 'yes' to continue: ");
        input.nextLine(); 
        continueAgain = input.nextLine();     
	} while(continueAgain.equals("yes"));
	System.out.print("The end");

}
} 