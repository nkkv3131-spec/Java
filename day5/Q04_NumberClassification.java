import java.util.Scanner;

public class Q04_NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = input.nextDouble();

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else {
            String sign = number > 0 ? "Positive" : "Negative";

            if (Math.abs(number) < 1) {
                System.out.println(sign + " small number");
            } else if (Math.abs(number) > 1_000_000) {
                System.out.println(sign + " large number");
            } else {
                System.out.println(sign + " number");
            }
        }
        input.close();
    }
}
