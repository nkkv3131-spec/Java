import java.util.*; 
public class Q16_RemoveDuplicates {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n],b=new int[n];int k=0;
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  for(int v:a){boolean found=false;for(int j=0;j<k;j++)if(b[j]==v)found=true;if(!found)b[k++]=v;}
  System.out.println(Arrays.toString(Arrays.copyOf(b,k)));s.close();
 }
}
