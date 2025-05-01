// MortgageCalculator.java

import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please Enter the Principal Amount: ");
	double principalAmount = input.nextDouble();

	System.out.println("Please Enter the Annual Interest Rate: ");
	double annualInterestRate = input.nextDouble();

	System.out.println("Please Enter the Duration In Years: ");
	int durationInYears = input.nextInt();


	double monthlyRate = annualInterestRate / 100 / 12;
	int durationInMonths = durationInYears * 12;

	double monthlyPayment = principalAmount * (monthlyRate * Math.pow(1 + monthlyRate, durationInMonths)) / (Math.pow(1 + monthlyRate, durationInMonths) - 1);


	System.out.printf("Your Monthly Payment is %.2f", monthlyPayment);
}
}

	
	