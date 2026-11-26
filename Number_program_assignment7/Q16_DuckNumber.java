import java.util.Scanner;
public class Q16_DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();
        System.out.println(s.matches("[1-9][0-9]*") && s.contains("0") ? "Duck number" : "Not a Duck number");
        sc.close();
    }
}
