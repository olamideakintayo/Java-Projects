// SumOfIntegersTest.java

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumOfIntegersTest {

	@Test
	public void displaySumOfIntegers() {
	SumOfIntegers digits = new SumOfIntegers();
	int number = 10000;
	int expected = 1;
	int actual = digits.additionOfIntegers(number);
	assertEquals(expected, actual);
	}
}