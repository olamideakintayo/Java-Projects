// RaiseToPowerInteger.java

import java.util.Scanner;
import java.math.BigInteger;

public class RaiseToPowerInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the whole number: ");
	int num = input.nextInt();

	System.out.print("Please enter the exponent number (Raise to the power number): ");
	int exponent = input.nextInt();

	BigInteger result = BigInteger.ONE;
	int counter = 0;
	
	while (counter < exponent) {
	result = result.multiply(BigInteger.valueOf(num));
	counter = counter + 1;
	}
	
	System.out.printf("The result of %d raised to the power of %d is: %d", num, exponent, result);
}
}