import java.util.*; 
public class Q11_ReverseArray {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  for(int i=0;i<n/2;i++){int t=a[i];a[i]=a[n-1-i];a[n-1-i]=t;}
  System.out.println(Arrays.toString(a));s.close();
 }
}
