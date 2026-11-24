import java.util.Scanner;

public class Q18_VotingEligibilitySwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        switch (age >= 18 ? 1 : 0) {
            case 1: System.out.println("Eligible to vote"); break;
            case 0: System.out.println("Not eligible to vote"); break;
        }
        input.close();
    }
}
