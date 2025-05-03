// Kata.java

public class Kata {

	public static boolean isEven(int number) {
	return number % 2 == 0;
	}

	public static boolean isPrimeNumber(int number) {
	if (number <= 1) {
	return false;
	}
	
	for (int counter = 2; counter < number; counter ++) {
        if (number % counter == 0) {
    	return false;
        }
	}
	return true;
	}


	public static int subtract (int firstNumber, int secondNumber) {
	int total = Math.abs(firstNumber - secondNumber);
	return total;
	}

	public static int factorOfInteger (int number) {
	int count = 0;
	for(int counter = 1; counter <= number; counter ++) {
	if(number % counter == 0) {
	count ++;
	}
	}
	return count;
	}

	public static float divide (int firstNumber, int secondNumber) {
	if (secondNumber == 0) {
	return 0;
	}
	int total = firstNumber / secondNumber;
	return (float) total;
	}

	public static boolean isSquare(int number) {
        return Math.sqrt(number) == (int) Math.sqrt(number);
	}

	public static boolean isPalindrome(int number) {
	int digit1;
	int digit2;
	int digit3;
	int digit4;

	while (true) {
	
	if (number < 10000 || number > 99999) {
	return false;
	}

	else {
	digit1 = number / 10000;
	digit2 = (number / 1000) % 10;
	digit3 = (number / 10) % 10;
	digit4= number % 10;

	if(digit1 == digit4 && digit2 == digit4) {
	return true;
	}
	}
	return true;
	}
	}

	public static long factorialOfInteger(int number) {
	int factorial = 1;

	for (int counter = 1; counter <= number; counter++) {
	factorial = factorial * counter;
	}
	return factorial;
	}

	public static long squareOfInteger(int number) {
	long square = number * number;
	return square;
	}
	
}