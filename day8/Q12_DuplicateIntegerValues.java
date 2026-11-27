import java.util.Scanner;
public class Q12_DuplicateIntegerValues {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.print("Duplicates: ");
  boolean any=false;
  for(int i=0;i<n;i++){boolean prior=false;for(int k=0;k<i;k++)if(a[k]==a[i])prior=true;
   int count=0;for(int v:a)if(v==a[i])count++;if(!prior&&count>1){System.out.print(a[i]+" ");any=true;}}
  if(!any)System.out.print("None");System.out.println();s.close();
 }
}
