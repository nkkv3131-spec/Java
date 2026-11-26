import java.util.Scanner;
public class Q15_BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n > 0 && (n % 7 == 0 || n % 10 == 7) ? "Buzz number" : "Not a Buzz number");
        sc.close();
    }
}
