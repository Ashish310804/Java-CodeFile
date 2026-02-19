import java.util.*;
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age1 = sc.nextInt();
        try {
            AgeValidator.validateAge(age1);                 //static call
            System.out.println("Valid age: " + age1);
        } 
        catch (InvalidAgeException iae) {
            System.out.println("Caught InvalidAgeException.");
        } 
        finally {
            System.out.println("Execution completed.");
            sc.close();
        }
    }
}


class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Age is not valid: " + age + ". Age must be greater than 0 or less than 120.");
    }
}


class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}


