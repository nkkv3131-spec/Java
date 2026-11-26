import java.util.Scanner;
public class Q03_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or word: ");
        String value = sc.nextLine();
        String reversed = new StringBuilder(value).reverse().toString();
        System.out.println(value.equalsIgnoreCase(reversed)
                ? value + " is a palindrome." : value + " is not a palindrome.");
        sc.close();
    }
}
