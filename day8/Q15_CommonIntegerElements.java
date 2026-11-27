import java.util.Scanner;
public class Q15_CommonIntegerElements {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("First size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.print("Second size: ");int m=s.nextInt();int[] b=new int[m];
  for(int i=0;i<m;i++)b[i]=s.nextInt();System.out.print("Common: ");boolean any=false;
  for(int i=0;i<n;i++){boolean prior=false;for(int k=0;k<i;k++)if(a[k]==a[i])prior=true;
   if(!prior)for(int v:b)if(a[i]==v){System.out.print(a[i]+" ");any=true;break;}}
  if(!any)System.out.print("None");System.out.println();s.close();
 }
}
