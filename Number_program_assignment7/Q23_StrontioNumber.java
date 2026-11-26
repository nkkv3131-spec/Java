import java.util.Scanner;
public class Q23_StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int n = sc.nextInt();
        if (n >= 1000 && n <= 9999) {
            String product = String.format("%04d", n * 2);
            System.out.println(product.charAt(1) == product.charAt(2) ? "Strontio number" : "Not a Strontio number");
        } else System.out.println("Please enter a four-digit number.");
        sc.close();
    }
}
