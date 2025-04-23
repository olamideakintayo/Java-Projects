// NumberPatternTwo.java

public class NumberPatternTwo {

    public static void main(String[] args) {

        int columnB = 6;

        System.out.println("Pattern B");

        int row = 1;
        while (row <= columnB) {

            String patternB = "";
            int colB = 1;
            while (colB <= columnB - row + 1) {
                patternB = patternB + colB;
                colB = colB + 1;
            }

            System.out.println(patternB);
            row = row + 1; // move to next row
        }
    }
}
