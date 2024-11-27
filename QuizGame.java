import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
            "What is the primary source of energy for Earth?",
            "What is the capital of Bangladesh?",
            "How many hours are there in a day ?",
            "What is the largest planet in our solar system?",
            "What is the boiling point of water in Celsius?"
        };

        String[] options = {
            "a) The Sun\nb) The Moon\nc) Water\nd) none",
            "a) Berlin\nb) Madrid\nc) Paris\nd) Dhaka",
            "a) 24\nb) 12\nc) 15\nd) 17",
            "a) Earth\nb) Mars\nc) Jupiter\nd) Saturn",
            "a) 90\nb) 95\nc) 100\nd) 105"
        };

        char[] answers = {'a', 'd', 'a', 'c', 'c'};
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Each correct answer gives you 5 points.\n");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = input.next().toLowerCase().charAt(0);

            // Check answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score += 5;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
            }
        }

        // Final score
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/25");

        input.close();
    }
}
