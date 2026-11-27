import java.util.Scanner;
public class Q02_SumArray {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt();
  int[] a=new int[n]; int sum=0;
  for(int i=0;i<n;i++){a[i]=s.nextInt();sum+=a[i];}
  System.out.println("Sum: "+sum); s.close();
 }
}
