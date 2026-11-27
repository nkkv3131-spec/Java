import java.util.Scanner;
public class Q17_SecondLargest {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();int[] a=new int[n];
  for(int i=0;i<n;i++)a[i]=s.nextInt();Integer max=null,second=null;
  for(int v:a){if(max==null||v>max){second=max;max=v;}else if(v<max&&(second==null||v>second))second=v;}
  System.out.println(second==null?"No second-largest distinct value.":"Second largest: "+second);s.close();
 }
}
