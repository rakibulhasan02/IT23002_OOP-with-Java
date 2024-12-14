import java.util.Scanner;

public class BaseConverter {
    // Convert any base to decimal
    private static int anyBaseToDecimal(String number, int sourceBase) {
        int decimalValue = 0;
        int length = number.length();
        for (int i = 0; i < length; i++) {
            char digit = number.charAt(length - 1 - i);
            int numericValue = (digit >= '0' && digit <= '9') ? digit - '0' : digit - 'A' + 10;
            decimalValue += numericValue * Math.pow(sourceBase, i);
        }
        return decimalValue;
    }

    // Convert decimal to any base
    private static String decimalToAnyBase(int decimalNumber, int targetBase) {
        StringBuilder result = new StringBuilder();
        String digits = "0123456789ABCDEF";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % targetBase;
            result.append(digits.charAt(remainder));
            decimalNumber /= targetBase;
        }

        return result.reverse().toString();
    }

    // Convert any base to any other base
    private static String baseToBase(String number, int sourceBase, int targetBase) {
        // Step 1: Convert source base to decimal
        int decimalValue = anyBaseToDecimal(number, sourceBase);
        // Step 2: Convert decimal to target base
        return decimalToAnyBase(decimalValue, targetBase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Enter the source base (e.g., 2 for binary, 10 for decimal): ");
        int sourceBase = scanner.nextInt();

        System.out.print("Enter the target base (e.g., 16 for hexadecimal): ");
        int targetBase = scanner.nextInt();

        // Perform conversion
        String result = baseToBase(number.toUpperCase(), sourceBase, targetBase);

        // Output result
        System.out.println("Converted number: " + result);
    }
}
