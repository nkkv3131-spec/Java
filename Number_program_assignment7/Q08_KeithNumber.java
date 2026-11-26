import java.util.Scanner;
import java.util.ArrayList;
public class Q08_KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if (n < 10) { System.out.println("Not a Keith number"); sc.close(); return; }
        ArrayList<Integer> seq = new ArrayList<>();
        for (char c : s.toCharArray()) seq.add(c - '0');
        int next = 0, index = 0;
        while (next < n) {
            next = 0;
            for (int x : seq) next += x;
            if (next == n) break;
            seq.set(index, next);
            index = (index + 1) % seq.size();
        }
        System.out.println(next == n ? "Keith number" : "Not a Keith number");
        sc.close();
    }
}
