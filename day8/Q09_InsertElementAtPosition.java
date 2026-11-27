import java.util.*; 
public class Q09_InsertElementAtPosition {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();
  System.out.print("Value and index: ");int x=s.nextInt(),k=s.nextInt();
  if(k<0||k>n)System.out.println("Invalid index.");
  else{int[] b=new int[n+1];for(int i=0;i<k;i++)b[i]=a[i];b[k]=x;for(int i=k;i<n;i++)b[i+1]=a[i];System.out.println(Arrays.toString(b));}
  s.close();
 }
}
