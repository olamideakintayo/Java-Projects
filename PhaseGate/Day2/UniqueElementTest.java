//UniqueElementTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class UniqueElementTest {

	@Test
	public void displayUniqueElements() {
	UniqueElement differentNumbers = new UniqueElement();
	int[] diffNums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7};
	int[] expected = {5, 6, 7};
	int[] actual = differentNumbers.notRepeatedNumbers(diffNums);
	assertArrayEquals(expected, actual);
	}
	
	@Test
	public void displayUniqueElements2() {
	UniqueElement differentNumbers = new UniqueElement();
	int[] diffNums = {1, 1, 2, 2, 3, 3, 5};
	int[] expected = {5};
	int[] actual = differentNumbers.notRepeatedNumbers(diffNums);
	assertArrayEquals(expected, actual);
	}

	}