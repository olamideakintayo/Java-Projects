// IndexTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class IndexTest {

	@Test
	public void displayIndex() {
	Index indexOfNumbers = new Index();
	int[] numbersOfIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] expected = {1, 2, 1, 0};
	int[] actual = indexOfNumbers.indexOfNumbers(numbersOfIndex);
	assertArrayEquals(expected, actual);
}
}
