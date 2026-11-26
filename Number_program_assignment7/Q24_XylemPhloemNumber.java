import java.util.Scanner;
public class Q24_XylemPhloemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();
        if (!s.matches("[0-9]+") || s.length() < 3) {
            System.out.println("Enter a number with at least three digits.");
        } else {
            int extreme = (s.charAt(0) - '0') + (s.charAt(s.length() - 1) - '0');
            int mean = 0;
            for (int i = 1; i < s.length() - 1; i++) mean += s.charAt(i) - '0';
            System.out.println(extreme == mean ? "Xylem number" : "Phloem number");
        }
        sc.close();
    }
}
