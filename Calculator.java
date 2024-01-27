import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Calculator {
    public static void main(String[] args)  throws NoSuchAlgorithmException{
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Check for division by zero
        double quotient = (num2 != 0) ? num1 / num2 : Double.POSITIVE_INFINITY;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        String input1 = "password1";
        String input2 = "password2";

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash1 = md.digest(input1.getBytes());
        byte[] hash2 = md.digest(input2.getBytes());

        System.out.println("Hash1: " + new String(hash1));
        System.out.println("Hash2: " + new String(hash2));
        // Close the scanner
        scanner.close();
    }
}
