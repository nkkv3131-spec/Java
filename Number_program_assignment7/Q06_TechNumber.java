import java.util.Scanner;
public class Q06_TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if (n >= 0 && s.length() % 2 == 0) {
            int half = s.length() / 2;
            int a = Integer.parseInt(s.substring(0, half));
            int b = Integer.parseInt(s.substring(half));
            System.out.println((a + b) * (a + b) == n ? "Tech number" : "Not a Tech number");
        } else System.out.println("Not a Tech number (it must have an even number of digits).");
        sc.close();
    }
}
