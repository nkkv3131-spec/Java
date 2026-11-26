import java.util.Scanner;
public class Q12_AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();
        int[] counts = new int[10];
        boolean valid = s.matches("\\d+");
        if (valid) {
            for (char c : s.toCharArray()) counts[c - '0']++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' != counts[i]) valid = false;
            }
        }
        System.out.println(valid ? "Autobiographical number" : "Not an autobiographical number");
        sc.close();
    }
}
