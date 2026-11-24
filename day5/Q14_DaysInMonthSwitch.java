import java.util.Scanner;

public class Q14_DaysInMonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        String name;
        int days;
        switch (month) {
            case 1: name = "January"; days = 31; break;
            case 2:
                name = "February";
                days = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
                break;
            case 3: name = "March"; days = 31; break;
            case 4: name = "April"; days = 30; break;
            case 5: name = "May"; days = 31; break;
            case 6: name = "June"; days = 30; break;
            case 7: name = "July"; days = 31; break;
            case 8: name = "August"; days = 31; break;
            case 9: name = "September"; days = 30; break;
            case 10: name = "October"; days = 31; break;
            case 11: name = "November"; days = 30; break;
            case 12: name = "December"; days = 31; break;
            default:
                System.out.println("Invalid month number");
                input.close();
                return;
        }
        System.out.println(name + " has " + days + " days");
        input.close();
    }
}
