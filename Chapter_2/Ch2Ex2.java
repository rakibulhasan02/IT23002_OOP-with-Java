import java.util.Scanner;

public class Ch2Ex2 {
    public static void main(String[] args) {
        double area, length, radius, volume;
        double pi = Math.PI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        area = pi * radius * radius; // Area of the base
        volume = area * length;     // Volume of the cylinder

        // Display the results
        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);

        input.close(); // Close the scanner to free resources
    }
}
