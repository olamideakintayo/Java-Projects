// IntegerFactors.java

public class IntegerFactors {
    public static int[] factorsOfIntegers(int number) {
        int count = 0;
        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) {
                factors[index] = counter;
                index++;
            }
        }

        return factors;
    }
}

