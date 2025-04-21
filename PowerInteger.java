// PowerInteger.java
import java.math.BigInteger;

public class PowerInteger {

	public static void main(String[] args) {

	System.out.printf("%-5s%-5s%-10s%n", "a", "b", "pow(a, b)");

	for (int a = 1; a <= 5; a++) {
	int b = a + 1;
	BigInteger result = BigInteger.ONE;
	int counter = 0;

	while (counter < b) {
	result = result.multiply(BigInteger.valueOf(a));
	counter ++;
}
	System.out.printf("%-5d%-5d%-10s%n", a, b, result.toString());

}

}
}