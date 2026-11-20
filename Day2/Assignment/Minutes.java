import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = input.nextLong();

        long days = minutes / (60 * 24);
        long years = days / 365;
        long remainingDays = days % 365;

        System.out.println(minutes +
                " minutes is approximately " + years +
                " years and " + remainingDays + " days");
    }
}