// ArrayMatrixTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayMatrixTest {

	@Test
	public void displayArrayMatrix() {
	ArrayMatrix matrixOfNumbers = new ArrayMatrix();
	int[][] arrays = {{1, 2, 3},
				  {4, 5, 6},
			       {7, 8, 9}
	};
	int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
	int[][] actual = matrixOfNumbers.arrayMatrixOfNumbers(arrays);
	assertArrayEquals(expected, actual);
	}
	}