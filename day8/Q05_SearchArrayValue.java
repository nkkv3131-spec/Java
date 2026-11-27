import java.util.Scanner;
public class Q05_SearchArrayValue {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(); int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  System.out.print("Value to search: "); int x=s.nextInt(); boolean found=false;
  for(int v:a)if(v==x)found=true;
  System.out.println(found?"Value found.":"Value not found."); s.close();
 }
}
