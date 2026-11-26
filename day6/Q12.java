import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input the 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int number = input.nextInt();
            sum += number;
        }
        double average = sum / 5.0;
        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
        input.close();
    }
}
