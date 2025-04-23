// Number PatternFour.java

public class NumberPatternFour {

    public static void main(String[] args) {

        int columnD = 6;

        System.out.println("Pattern D");

        int row = 1;
        while (row <= columnD) {

            String patternD = "";
            int spaceD = 1;
            while (spaceD < row) {
                patternD = patternD + " ";
                spaceD = spaceD + 1;
            }
            int colD = 1;
            while (colD <= columnD - row + 1) {
                patternD = patternD + colD;
                colD = colD + 1;
            }

            System.out.println(patternD);
            row = row + 1;
        }
    }

}
