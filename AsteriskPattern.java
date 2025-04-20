AsteriskPattern.java

public class AsteriskPattern {

    public static void main(String[] args) {

        int columnA = 6;

        System.out.printf("%-12s%-12s%-12s%-12s%n", "Pattern A", "Pattern B", "Pattern C", "Pattern D");

        int row = 1;
        while (row <= columnA) {

            String patternA = "";
            int colA = 1;
            while (colA <= row) {
                patternA = patternA + "*";
                colA = colA + 1;
            }

            String patternB = "";
            int colB = 1;
            while (colB <= columnA - row + 1) {
                patternB = patternB + "*";
                colB = colB + 1;
            }

            String patternC = "";
            int spaceC = columnA - row;
            while (spaceC > 0) {
                patternC = patternC + " ";
                spaceC = spaceC - 1;
            }
            int colC = 1;
            while (colC <= row) {
                patternC = patternC + "*";
                colC = colC + 1;
            }

            String patternD = "";
            int spaceD = 1;
            while (spaceD < row) {
                patternD = patternD + " ";
                spaceD = spaceD + 1;
            }
            int colD = 1;
            while (colD <= columnA - row + 1) {
                patternD = patternD + "*";
                colD = colD + 1;
            }

            System.out.printf("%-12s%-12s%-12s%-12s%n", patternA, patternB, patternC, patternD);

            row = row + 1;
        }

    }

}
