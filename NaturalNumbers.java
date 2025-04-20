// NaturalNumbers.java

public class NaturalNumbers {

	public static void main(String[] args) {
	int sum = 0;

	for(int counter = 1; counter <= 10; counter ++) {
	System.out.println(counter + " ");
	sum += counter;
	}

	System.out.print("The sum of the first ten natural numbers are: " + sum);
}
}