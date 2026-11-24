import java.util.Scanner;

public class Q13_EvenOddSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        switch (Math.abs(number % 2)) {
            case 0: System.out.println("Even"); break;
            case 1: System.out.println("Odd"); break;
        }
        input.close();
    }
}
