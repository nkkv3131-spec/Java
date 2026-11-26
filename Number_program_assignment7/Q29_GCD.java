import java.util.Scanner;
public class Q29_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = Math.abs(sc.nextInt()), b = Math.abs(sc.nextInt());
        while (b != 0) { int r = a % b; a = b; b = r; }
        System.out.println("GCD: " + a);
        sc.close();
    }
}
