
import java.util.Scanner;
public class Ch2Ex1 {
    public static void main(String[] args) {
        double celcius,farenheit;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a degree in celcius : ");
        celcius = input.nextDouble();
        farenheit=9.0/5*celcius+32;
        System.out.println(celcius+" celcius is "+farenheit+" farenheit");


    }
}
