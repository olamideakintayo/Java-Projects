// Questionnaire.java
import java.util.*;

public class Questionnaire {

    private static class Question {
        String question;
        char answer;
        String[] options;

        Question(String question, char answer, String[] options) {
            this.question = question;
            this.answer = answer;
            this.options = options;
        }
    }

    private List<Question> questions;
    private List<Question> questionsShuffled;
    private Set<Integer> answeredQuestions;
    private int score;
    private int attemptedQuestions;
    private List<Question> missedQuestions;

    public Questionnaire() {
        questions = new ArrayList<>();
        questions.add(new Question("What is the capital of Lagos?", 'b', new String[]{"Paris", "Ikeja", "New York", "Banana Island"}));
        questions.add(new Question("Who is the CEO of Tesla?", 'd', new String[]{"Bill Gates", "Tim Cook", "Jeff Bezos", "Elon Musk"}));
        questions.add(new Question("What club in England has the most trophies?", 'a', new String[]{"Manchester United", "Chelsea", "Liverpool", "Arsenal (hahaha)"}));
        questions.add(new Question("5 x 20?", 'c', new String[]{"200", "145", "100", "99"}));
        questions.add(new Question("16 x 4?", 'a', new String[]{"64", "23", "45", "60"}));
        questions.add(new Question("Who is the President of Nigeria?", 'a', new String[]{"Bola Ahmed Tinubu", "Kassim Shettima", "Nyesom Wike", "Nasir El Rufai"}));
        questions.add(new Question("Who is the President of the United States of America?", 'c', new String[]{"Bill Gates", "Barack Obama", "Joe Biden", "Donald Trump"}));
        questions.add(new Question("50 + 362?", 'b', new String[]{"500", "412", "644", "402"}));
        questions.add(new Question("Who is the richest man in the world?", 'c', new String[]{"Jeff Bezos", "Bill Gates", "Elon Musk", "Mark Zuckerberg"}));
        questions.add(new Question("Who is the CEO of Facebook?", 'a', new String[]{"Mark Zuckerberg", "Tim Cook", "Jeff Bezos", "Elon Musk"}));

        questionsShuffled = new ArrayList<>(questions);
        Collections.shuffle(questionsShuffled);

        answeredQuestions = new HashSet<>();
        score = 0;
        attemptedQuestions = 0;
        missedQuestions = new ArrayList<>();
    }

    public void quizApp() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Questionnaire ===");

        while (answeredQuestions.size() < 10) {
            System.out.print("Please Pick a question number from (1-10) or type 'exit' to end the program: ");
            String userInput = input.nextLine().trim();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! Have a nice day! Thank you!");
                break;
            }

            int questionNumber;

            try {
                questionNumber = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please choose a number between 1 and 10.");
                continue;
            }

            if (questionNumber < 1 || questionNumber > 10) {
                System.out.println("Invalid input. Please choose a number between 1 and 10.");
                continue;
            }

            if (answeredQuestions.contains(questionNumber)) {
                System.out.println("That question has already been used. Please pick another one.");
                continue;
            }

            answeredQuestions.add(questionNumber);

            Question currentQuestion = questionsShuffled.get(questionNumber - 1);
            System.out.println("\nQ" + questionNumber + ": " + currentQuestion.question);

            char optionChar = 'a';
            for (String option : currentQuestion.options) {
                System.out.println(optionChar + ": " + option);
                optionChar++;
            }

            int attempts = 0;
            boolean correct = false;
            while (attempts < 3) {
                System.out.print("Please enter your answer (a/b/c/d): ");
                String answer = input.nextLine().trim().toLowerCase();

                if (!answer.matches("[abcd]")) {
                    System.out.println("Invalid option. Please Choose either a, b, c, or d.");
                    continue;
                }

                if (answer.charAt(0) == currentQuestion.answer) {
                    System.out.println("You are correct!\n");
                    score++;
                    correct = true;
                    break;
                } else {
                    System.out.println("Incorrect! Please try again.");
                    attempts++;
                }
            }

            attemptedQuestions++;
            if (!correct) {
                missedQuestions.add(currentQuestion);
                int correctIndex = currentQuestion.answer - 'a';
                System.out.println("Correct answer was: " + Character.toUpperCase(currentQuestion.answer)
                        + ": " + currentQuestion.options[correctIndex] + "\n");
            }
        }

        System.out.println("\n=== Quiz Completed ===");
        System.out.println("You answered " + score + " out of " + attemptedQuestions + " correctly.");

        if (!missedQuestions.isEmpty()) {
            System.out.println("\nQuestions you missed:");
            int idx = 1;
            for (Question q : missedQuestions) {
                int correctIndex = q.answer - 'a';
                System.out.println(idx + ". " + q.question);
                System.out.println("   Correct Answer: " + q.options[correctIndex]);
                idx++;
            }
        }

     
    }

    public static void main(String[] args) {
        Questionnaire quiz = new Questionnaire();
        quiz.quizApp();
    }
}
