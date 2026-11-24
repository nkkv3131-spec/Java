import java.util.Scanner;

public class Q11_GenderSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().toUpperCase().charAt(0);

        switch (gender) {
            case 'M': System.out.println("Male"); break;
            case 'F': System.out.println("Female"); break;
            default: System.out.println("Invalid gender");
        }
        input.close();
    }
}
