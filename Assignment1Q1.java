import java.util.*;
public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice;
        do {
            System.out.println("\n------------------Banking Management System---------------------- \n1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit \nEnter your choice:\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: " + depositAmount);
                    } else {
                        System.out.println(" Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: " + withdrawAmount);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Exiting...!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
