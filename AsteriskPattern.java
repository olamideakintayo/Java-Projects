// AsteriskPattern,java

public class AsteriskPattern {

    public static void main(String[] args) {
        int n = 5;

        System.out.printf("%-17s%-17s%-17s%-17s%n", "A", "B", "C", "D");

        for (int column = 1; column <= n; column++) {
            for (int row = 1; row <= column; row++) {
                System.out.print("* ");
            }
            for (int space = column; space < n; space++) {
                System.out.print("  ");
            }
            System.out.print("   ");

            for (int row = column; row <= n; row++) {
                System.out.print("* ");
            }
            for (int space = 1; space < column; space++) {
                System.out.print("  ");
            }
            System.out.print("   ");

            for (int row = 1; row <= column; row++) {
                System.out.print("  ");
            }
            for (int row = column; row <= n; row++) {
                System.out.print("* ");
            }
            System.out.print("   ");

            for (int row = column; row <= n; row++) {
                System.out.print("  ");
            }
            for (int row = 1; row <= column; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
