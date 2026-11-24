import java.util.Scanner;

public class Q07_DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();

        String[] names = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        } else {
            int days;
            if (month == 2) {
                boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                days = leap ? 29 : 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else {
                days = 31;
            }
            System.out.println(names[month] + " " + year + " has " + days + " days");
        }
        input.close();
    }
}
