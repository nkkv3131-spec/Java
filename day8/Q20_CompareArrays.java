import java.util.*; 
public class Q20_CompareArrays {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("First array size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.print("Second array size: ");int m=s.nextInt();int[] b=new int[m];
  for(int i=0;i<m;i++)b[i]=s.nextInt();
  System.out.println(Arrays.equals(a,b)?"Arrays are equal.":"Arrays are not equal.");s.close();
 }
}
