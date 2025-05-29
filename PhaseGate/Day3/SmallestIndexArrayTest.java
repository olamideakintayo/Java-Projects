// SmallestIndexArray.java

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmallestIndexArrayTest{

	@Test
	public void displaySmallestIndexArray() {
	SmallestIndexArray smallestIndex = new SmallestIndexArray();
	int[] numbers = {1, 5, 3, 4, 5, 5};
	int expected  = 1;
	int actual = smallestIndex.smallestIndexOfLargestElement(numbers);
	assertEquals(expected, actual);
	}
	
	@Test
	public void displaySmallestIndexArray2() {
	SmallestIndexArray smallestIndex = new SmallestIndexArray();
	int[] numbers = {2, 38, 67, 98, 63, 98};
	int expected  = 3;
	int actual = smallestIndex.smallestIndexOfLargestElement(numbers);
	assertEquals(expected, actual);
	}

	}