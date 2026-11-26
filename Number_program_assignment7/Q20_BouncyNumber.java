import java.util.Scanner;
public class Q20_BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i - 1)) decreasing = false;
            if (s.charAt(i) < s.charAt(i - 1)) increasing = false;
        }
        System.out.println(s.length() > 2 && !increasing && !decreasing ? "Bouncy number" : "Not a Bouncy number");
        sc.close();
    }
}
