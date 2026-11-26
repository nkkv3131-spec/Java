import java.util.Scanner;
public class Q10_ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        System.out.println("Character: " + character);
        System.out.println("ASCII value: " + (int) character);
        sc.close();
    }
}
