import java.util.Scanner;
public class Q11_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.00;
        int choice;
        do {
            System.out.println("\n1. Check balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.printf("Current balance: %.2f%n", balance); break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) { balance += deposit; System.out.println("Deposit successful."); }
                    else System.out.println("Invalid amount.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal <= 0) System.out.println("Invalid amount.");
                    else if (withdrawal > balance) System.out.println("Insufficient balance.");
                    else { balance -= withdrawal; System.out.println("Withdrawal successful."); }
                    break;
                case 4: System.out.println("Thank you."); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 4);
        sc.close();
    }
}
