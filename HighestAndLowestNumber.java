// HighestAndLowestNumber.java

import java.util.Scanner;

public class HighestAndLowestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int counter = 0; counter != 233434; counter++) {

            System.out.println("Please enter number " + (counter + 1) + ":");
            int num = input.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }

            input.nextLine();

            System.out.println("Do you wish to continue? Press stop to end the program or Press the Enter key to continue: ");
            String stop = input.nextLine();

            if (stop.equals("stop") || stop.equals("Stop")) {
                break;
            }
        }

        System.out.println("The largest integer is: " + largest);
        System.out.println("The smallest integer is: " + smallest);
    }
}
