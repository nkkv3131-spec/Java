import java.util.Scanner;
public class Q04_AverageArray {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt();
  if(n<=0){System.out.println("Size must be positive.");}else{
   int[] a=new int[n]; double sum=0;
   for(int i=0;i<n;i++){a[i]=s.nextInt();sum+=a[i];}
   System.out.println("Average: "+sum/n);
  } s.close();
 }
}
