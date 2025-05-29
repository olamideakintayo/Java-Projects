// ArrayMatrix.java

public class ArrayMatrix {
    public int[][] arrayMatrixOfNumbers(int[][] numbers) {
        int[][] result = new int[numbers[0].length][numbers.length];
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int count = 0; count < numbers[counter].length; count++) {
                result[count][numbers.length - 1 - counter] = numbers[counter][count];
            }
        }
        return result;
    }
}
