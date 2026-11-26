import java.util.Scanner;
public class Q02_NumberToWords {
    static final String[] ONES = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static final String[] TENS = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    static String words(int n) {
        if (n < 20) return ONES[n];
        if (n < 100) return TENS[n / 10] + (n % 10 == 0 ? "" : " " + ONES[n % 10]);
        if (n < 1000) return ONES[n / 100] + " hundred" + (n % 100 == 0 ? "" : " " + words(n % 100));
        return ONES[n / 1000] + " thousand" + (n % 1000 == 0 ? "" : " " + words(n % 1000));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-9999): ");
        int n = sc.nextInt();
        if (n < 0 || n > 9999) System.out.println("Please enter a number from 0 to 9999.");
        else System.out.println(words(n));
        sc.close();
    }
}
