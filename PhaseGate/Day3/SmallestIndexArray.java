// SmallestIndexArray.java

public class SmallestIndexArray {
    public static int smallestIndexOfLargestElement(int[] array) {
        int maxValue = array[0];
        int index = 0;
        for (int count = 1; count < array.length; count++) {
            if (array[count] > maxValue) {
                maxValue = array[count];
                index = count;
            }
        }
        return index;
    }
}
