// PrimeNumber.java

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please Enter a positive integer: ");
	int num = input.nextInt();

	if (num <= 1) {
        System.out.printf("%d is not a Prime Number", num);
        } 
        	
	else {
	for (int counter = 2; counter < num; counter ++) {
        if (num % counter == 0) {
	System.out.printf("%d is not a prime number!", num);
    	return; 
        }
	}
	System.out.printf("%d is a Prime Number!!", num);
	
}
}
}