import java.util.Scanner;

public class Q05_WeekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int day = input.nextInt();

        // Numbering follows the assignment example: 1 = Monday, 3 = Wednesday.
        String[] weekdays = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        };

        if (day >= 1 && day <= 7) {
            System.out.println(weekdays[day - 1]);
        } else {
            System.out.println("Invalid weekday number");
        }
        input.close();
    }
}
