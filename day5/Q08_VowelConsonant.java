import java.util.Scanner;

public class Q08_VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String value = input.nextLine();

        if (value.length() != 1 || !Character.isLetter(value.charAt(0))
                || !((value.charAt(0) >= 'a' && value.charAt(0) <= 'z')
                  || (value.charAt(0) >= 'A' && value.charAt(0) <= 'Z'))) {
            System.out.println("Error: please enter a single alphabet letter.");
        } else {
            char letter = Character.toLowerCase(value.charAt(0));
            if ("aeiou".indexOf(letter) >= 0) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
        input.close();
    }
}
