import java.util.Scanner;

public class rangeOfFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a, b;
        System.out.print("Enter your first and last number in range: ");
        a = input.nextLong();
        b = input.nextLong();

        long count = 0;

        for (long i = a; i <= b; i++) {
            long n = i;
            long sum = 0, rem;

            while (n != 0) {
                long fact = 1;
                rem = n % 10;

                for (long j = 1; j <= rem; j++) {
                    fact *= j;
                }

                sum += fact;
                n /= 10;
            }

            if (sum == i) {
                count++;
                System.out.println(sum);
            }
        }

        System.out.println("Count of strong numbers in the range: " + count);
        input.close();
    }
}
