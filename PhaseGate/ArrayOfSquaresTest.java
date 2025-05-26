// ArrayOfSquaresTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayOfSquaresTest {

	@Test
	public void displayArrayOfSquares() {
	ArrayOfSquares ascendingSquaresArray = new ArrayOfSquares();
	int[] arrayOfSquareNumbers = {9, 2, 7, 0, 5};
	int[] expected = {0, 4, 25, 49, 81};
	int[] actual = ascendingSquaresArray.squareNumbers(arrayOfSquareNumbers);
	assertArrayEquals(expected, actual);
	
}

@Test
	public void displayArrayOfSquares2() {
	ArrayOfSquares ascendingSquaresArray = new ArrayOfSquares();
	int[] arrayOfSquareNumbers = {9, 2, 7, 0, -5};
	int[] expected = {0, 4, 25, 49, 81};
	int[] actual = ascendingSquaresArray.squareNumbers(arrayOfSquareNumbers);
	assertArrayEquals(expected, actual);
	
}





}