// IntegerFactors.java

import java.util.Scanner;

public class IntegerFactors {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please Enter a number to check for the factor: ");
	int num = input.nextInt();

	System.out.print("The factors of " + num + " are: ");

	for(int counter = 1; counter <= num; counter ++) {
	if(num % counter == 0) {
	System.out.print(counter + " ");
}
}
}
}
	