// NumberPatternThree.java

public class NumberPatternThree {

    public static void main(String[] args) {

        int columnC = 6;

        System.out.println("Pattern C");

        int row = 1;
        while (row <= columnC) {

            String patternC = "";

            int spaceC = columnC - row;
            while (spaceC > 0) {
                patternC = patternC + " ";
                spaceC = spaceC - 1;
            }

            int colC = row;
            while (colC >= 1) {
                patternC = patternC + colC;
                colC = colC - 1;
            }

            System.out.println(patternC);
            row = row + 1;
        }
    }
}
