// RandomSubtractionProblem.java

import java.util.Scanner;
import java.util.Random;

public class RandomSubtractionProblem {
    static int totalQuestions = 10;
    static int answerCount = 0;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < totalQuestions; i++) {
            askQuestion();
        }
        System.out.println("Thank You!! You answered " + answerCount + " out of " + totalQuestions + " correctly. Have a nice Day");
    }

    public static void askQuestion() {
        int number1 = random.nextInt(1000);
        int number2 = random.nextInt(1000);

        int minuend = Math.max(number1, number2);
        int subtrahend = Math.min(number1, number2);
        int correctAnswer = minuend - subtrahend;

        System.out.println("What is " + minuend + " - " + subtrahend + "?");

        int attemptsLeft = 2;
        long startTime = System.currentTimeMillis();

        while (attemptsLeft > 0) {
            System.out.print("Enter your Answer: ");
            String input = scanner.nextLine();

            try {
                int userAnswer = Integer.parseInt(input);
                if (userAnswer == correctAnswer) {
                    long timeTaken = System.currentTimeMillis() - startTime;
                    System.out.printf("Correct! Time taken: %.2f seconds%n", timeTaken / 1000.0);
                    answerCount++;
                    return;
                } else {
                    attemptsLeft--;
                    if (attemptsLeft > 0) {
                        System.out.println("Wrong! Try again. Attempts left: " + attemptsLeft);
                    } else {
                        long timeTaken = System.currentTimeMillis() - startTime;
                        System.out.println("Wrong again. The correct answer was " + correctAnswer + ".");
                        System.out.printf("Time taken: %.2f seconds%n", timeTaken / 1000.0);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
