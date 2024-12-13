import java.util.Scanner;

public class DivisorMultileClass1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long a = input.nextLong();
        System.out.print("Enter second number: ");
        long b = input.nextLong();
        long A=a,B=b;
        // Using Euclid's Algorithm to find GCD
        do{
            long rem = a % b;
            a = b;
            b = rem;
        }while (b != 0) ;
        
        long gcd=a;
        long lcm=A*B/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}
