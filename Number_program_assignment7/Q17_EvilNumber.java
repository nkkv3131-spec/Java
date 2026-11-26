import java.util.Scanner;
public class Q17_EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();
        int ones = Integer.bitCount(n);
        System.out.println(n >= 0 && ones % 2 == 0 ? "Evil number" : "Not an Evil number");
        sc.close();
    }
}
