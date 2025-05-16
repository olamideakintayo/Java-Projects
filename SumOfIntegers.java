// SumOfntegers.java

public class SumOfIntegers {

	public int additionOfIntegers(int number) {
	int total = 0;
	
	while (number >= 1 && number <= 10000) {
	int digit = number % 10;
	total = total + digit;
	number = number / 10;
	}
	return total;
}
}