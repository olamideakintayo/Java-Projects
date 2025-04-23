// FourPattern.java

public class NumberPattern {

    public static void main(String[] args) {

        int columnA = 6;

        System.out.printf("Pattern A");

        int row = 1;
        while (row <= columnA) {

            String patternA = "";
            int colA = 1;
            while (colA <= row) {
                patternA = patternA + colA;
                colA = colA + 1;
            }

            System.out.println(patternA);

            row = row + 1;
        }
    }
}
