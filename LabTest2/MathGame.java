//Md Rakibul Hasan
//IT23002
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SimpleMathGame {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Math Game!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy (Numbers 1-10)");
        System.out.println("2. Medium (Numbers 1-50)");
        System.out.println("3. Hard (Numbers 1-100)");

        int difficulty = scanner.nextInt();
        int range = switch (difficulty) {
            case 1 -> 10;
            case 2 -> 50;
            case 3 -> 100;
            default -> {
                System.out.println("Invalid choice. Exiting...");
                System.exit(1);
                yield 0;
            }
        };

        int totalQuestions = 5; // Fixed number of questions
        int score = 0;

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = random.nextInt(range) + 1;
            int num2 = random.nextInt(range) + 1;
            char operator = randomOperator();

            System.out.printf("Question %d: What is %d %c %d? ", i + 1, num1, operator, num2);
            int userAnswer = scanner.nextInt();

            int correctAnswer = calculateAnswer(num1, num2, operator);
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.printf("Wrong! The correct answer was %d.%n", correctAnswer);
            }
        }

        System.out.printf("Game Over! %s, your score is %d/%d.%n", name, score, totalQuestions);
        saveScore(name, difficulty, score, totalQuestions);
    }

    private static char randomOperator() {
        char[] operators = {'+', '-', '*', '/'};
        return operators[new Random().nextInt(operators.length)];
    }

    private static int calculateAnswer(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 != 0 ? num1 / num2 : 0); // Avoid division by zero
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

    private static void saveScore(String name, int difficulty, int score, int total) throws IOException {
        String[] levels = {"Easy", "Medium", "Hard"};
        String difficultyLevel = levels[difficulty - 1];
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String record = String.format("%s, %s, %d/%d, %s%n", name, difficultyLevel, score, total, timeStamp);

        try (FileWriter writer = new FileWriter("scores.txt", true)) {
            writer.write(record);
        }
    }
}
