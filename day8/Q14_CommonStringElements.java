import java.util.Scanner;
public class Q14_CommonStringElements {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("First size: ");int n=s.nextInt();String[] a=new String[n];
  for(int i=0;i<n;i++)a[i]=s.next();System.out.print("Second size: ");int m=s.nextInt();String[] b=new String[m];
  for(int i=0;i<m;i++)b[i]=s.next();System.out.print("Common: ");boolean any=false;
  for(int i=0;i<n;i++){boolean prior=false;for(int k=0;k<i;k++)if(a[k].equals(a[i]))prior=true;
   if(!prior)for(String v:b)if(a[i].equals(v)){System.out.print(a[i]+" ");any=true;break;}}
  if(!any)System.out.print("None");System.out.println();s.close();
 }
}
