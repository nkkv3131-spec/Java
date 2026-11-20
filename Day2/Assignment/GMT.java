import java.util.Scanner;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class GMT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        int offset = sc.nextInt();

        LocalTime time = LocalTime.now(ZoneOffset.UTC);
        time = time.plusHours(offset);

        System.out.println("Current time is " + time);

    }
}