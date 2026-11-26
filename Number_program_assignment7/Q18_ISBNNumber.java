import java.util.Scanner;
public class Q18_ISBNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10-digit ISBN (hyphens/spaces allowed): ");
        String s = sc.next().replace("-", "").replace(" ", "").toUpperCase();
        boolean valid = s.length() == 10;
        int sum = 0;
        if (valid) {
            for (int i = 0; i < 10; i++) {
                char c = s.charAt(i);
                int digit = (c == 'X' && i == 9) ? 10 : (c >= '0' && c <= '9' ? c - '0' : -1);
                if (digit < 0) { valid = false; break; }
                sum += (10 - i) * digit;
            }
        }
        System.out.println(valid && sum % 11 == 0 ? "Valid ISBN-10" : "Invalid ISBN-10");
        sc.close();
    }
}
