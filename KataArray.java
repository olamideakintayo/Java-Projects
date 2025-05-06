// KataArray.java

public class KataArray {

	public static int maximumIn(int[] numbers) {
	int maxNumber = numbers[0];

	for(int counter = 0; counter < numbers.length; counter++) {
		if (numbers[counter] > maxNumber) {
		maxNumber = numbers[counter];
		}
	}
	return maxNumber;
	}

	public static int minimumIn(int[] numbers) {
	int minNumber = numbers[0];

	for(int counter = 0; counter > numbers.length; counter++) {
		if (numbers[counter] < minNumber) {
		minNumber = numbers[counter];
		}
	}
	return minNumber;
	}

	public static int sumOf(int[] numbers) {
	int total = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		total = total + numbers[counter];
		}
	return total;
	}

	public static int sumOfEvenNumbersIn(int[] numbers) {
	int evenTotal = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 == 0) {
		evenTotal = evenTotal + numbers[counter];
		}
	}
	return evenTotal;
	}

	public static int sumOfOddNumbersIn(int[] numbers) {
	int oddTotal = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 != 0) {
		oddTotal = oddTotal + numbers[counter];
		}
	}
	return oddTotal;
	}

	public static int[] maximumAndMinimumOf(int[] numbers) {
	int minNumber = numbers[0];
	int maxNumber = numbers[0];

	for(int counter = 0; counter < numbers.length; counter++) {
		if (numbers[counter] < minNumber) {
		minNumber = numbers[counter];
		}

		if (numbers[counter] > maxNumber) {
		maxNumber = numbers[counter];
		}
	}
	return new int[] {minNumber, maxNumber };
	}
	
	public static int noOfOddNumbersIn(int[] numbers) {
	int oddTotal = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 != 0) {
		oddTotal++;
		}
	}
	return oddTotal;
	}

	public static int noOfEvenNumbersIn(int[] numbers) {
	int evenTotal = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 == 0) {
		evenTotal++;
		}
	}
	return evenTotal;
	}

	public static int[] evenNumbersIn(int[] numbers) {
	int even = 0;
	int[] evenNumbers = new int[noOfEvenNumbersIn(numbers)];
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 == 0) {
		evenNumbers[even] = numbers[counter];
		even++;
		}
	}
	return evenNumbers;
	}

	public static int[] oddNumbersIn(int[] numbers) {
	int odd = 0;
	int[] oddNumbers = new int[noOfOddNumbersIn(numbers)];
	for(int counter = 0; counter < numbers.length; counter++) {
		if(numbers[counter] % 2 != 0) {
		oddNumbers[odd] = numbers[counter];
		odd++;
		}
	}
	return oddNumbers;
	}

	public static void squareNumbersIn(int[] numbers) {
	for(int counter = 0; counter < numbers.length; counter++) {
		if(Math.sqrt(numbers[counter]) % 1 == 0) {
		System.out.print(numbers[counter] + " ");
	}
	}
	}
	
}