import java.util.Scanner;
public class Q18_SecondSmallest {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();Integer min=null,second=null;
  for(int v:a){if(min==null||v<min){second=min;min=v;}else if(v>min&&(second==null||v<second))second=v;}
  System.out.println(second==null?"No second-smallest distinct value.":"Second smallest: "+second);s.close();
 }
}
