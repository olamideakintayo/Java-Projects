// UniqueElement.java

public class UniqueElement {

	public static int numberOfRepeatedNumbers(int[] numbers) {
	int unique = 0;

	for (int counter = 0; counter < numbers.length; counter++) {
	boolean numberUnique = true;
		for (int j = 0; j < numbers.length; j++) {
		if (counter != j && numbers[counter] == numbers[j]) {
		numberUnique = false;
		break;
		}
		}

		if (numberUnique) {
		unique++;
		}
		}
		return unique++;
		}

	public static int[] notRepeatedNumbers(int[] numbers) {
	int[] diffNumbers = new int[numberOfRepeatedNumbers(numbers)];
	int differentNumber = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
		boolean notUniqueNumber = true;
		for(int i = 0; i < numbers.length; i++) {
		if (counter != i && numbers[counter] == numbers[i]) {
		notUniqueNumber = false;
		break;
		}
		}
		if (notUniqueNumber) {
		diffNumbers[differentNumber] = numbers[counter];
		differentNumber++;
		}
		}

		return diffNumbers;
}
}