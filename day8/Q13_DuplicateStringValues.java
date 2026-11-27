import java.util.Scanner;
public class Q13_DuplicateStringValues {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();String[] a=new String[n];
  for(int i=0;i<n;i++)a[i]=s.next();System.out.print("Duplicates: ");boolean any=false;
  for(int i=0;i<n;i++){boolean prior=false;for(int k=0;k<i;k++)if(a[k].equals(a[i]))prior=true;
   int count=0;for(String v:a)if(v.equals(a[i]))count++;if(!prior&&count>1){System.out.print(a[i]+" ");any=true;}}
  if(!any)System.out.print("None");System.out.println();s.close();
 }
}
