import java.util.Scanner;
public class Q06_FindElementIndex {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(); int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  System.out.print("Element: "); int x=s.nextInt(), index=-1;
  for(int i=0;i<n;i++)if(a[i]==x){index=i;break;}
  System.out.println("Index: "+index); s.close();
 }
}
