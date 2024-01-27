import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Calculator {
    public static void main(String[] args)  throws NoSuchAlgorithmException{
       

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
