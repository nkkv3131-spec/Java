import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        System.out.print("Input hour: ");
        int hours = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        double totalSeconds = hours * 3600 + minutes * 60 + seconds;

        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = metersPerSecond * 3.6;
        double milesPerHour = metersPerSecond * 3600 / 1609;

        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}
