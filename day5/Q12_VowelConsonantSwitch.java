import java.util.Scanner;

public class Q12_VowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String value = input.next();

        if (value.length() != 1 || !((value.charAt(0) >= 'a' && value.charAt(0) <= 'z')
                || (value.charAt(0) >= 'A' && value.charAt(0) <= 'Z'))) {
            System.out.println("Invalid input");
        } else {
            char letter = Character.toLowerCase(value.charAt(0));
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
        input.close();
    }
}
