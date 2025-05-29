// IntegerFactorsTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class IntegerFactorsTest {

	@Test
	public void displayIntegerFactors() {
	IntegerFactors factorsOfIntegers = new IntegerFactors();
	int number = 7;
	int[] expected = {1, 7};
	int[] actual = factorsOfIntegers.factorsOfIntegers(number);
	assertArrayEquals(expected, actual);
	}
	
	@Test
	public void displayIntegerFactors2() {
	IntegerFactors factorsOfIntegers = new IntegerFactors();
	int number = 24;
	int[] expected = {1, 2, 3, 4, 6, 8, 12, 24};
	int[] actual = factorsOfIntegers.factorsOfIntegers(number);
	assertArrayEquals(expected, actual);
	}

	
	}
