// package assignment.Chapter2;
/*(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */
import java.util.Scanner;
public class Ch2Ex3 {
    public static void main(String[] args) {
        double feet,meter;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        feet=input.nextDouble();
        meter=feet*0.305;
        System.out.println(feet+" feet is equal to "+meter+" meters");

        input.close();
    }
}
