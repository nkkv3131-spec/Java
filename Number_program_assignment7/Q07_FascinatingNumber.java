import java.util.Scanner;
public class Q07_FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("Not a fascinating number"); }
        else {
            String s = "" + n + (n * 2) + (n * 3);
            boolean[] seen = new boolean[10];
            boolean ok = s.length() == 9;
            for (char c : s.toCharArray()) {
                int d = c - '0';
                if (d == 0 || seen[d]) ok = false;
                seen[d] = true;
            }
            System.out.println(ok ? "Fascinating number" : "Not a fascinating number");
        }
        sc.close();
    }
}
