import java.util.*; 
public class Q07_RemoveArrayElement {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(); int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  System.out.print("Value to remove: "); int x=s.nextInt(), k=-1;
  for(int i=0;i<n;i++)if(a[i]==x){k=i;break;}
  if(k<0)System.out.println("Element not found: "+Arrays.toString(a));
  else {int[] b=new int[n-1];for(int i=0,j=0;i<n;i++)if(i!=k)b[j++]=a[i];System.out.println(Arrays.toString(b));}
  s.close();
 }
}
