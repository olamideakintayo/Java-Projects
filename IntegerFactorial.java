// IntegerFactorial.java

import java.util.Scanner;
import java.math.BigInteger;

public class IntegerFactorial {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Please enter an integer: ");
	int num = input.nextInt();

	BigInteger factorial = BigInteger.ONE;

	for (int counter = 1; counter <= num; counter++) {

	 factorial = factorial.multiply(BigInteger.valueOf(counter));

	}

	System.out.printf("The Factorial of %d = %d", num, factorial);
}
}

