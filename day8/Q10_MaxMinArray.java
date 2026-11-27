import java.util.Scanner;
public class Q10_MaxMinArray {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Size: ");int n=s.nextInt();
  if(n<=0)System.out.println("Array cannot be empty.");
  else{int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int min=a[0],max=a[0];
   for(int v:a){if(v<min)min=v;if(v>max)max=v;}System.out.println("Min: "+min+" Max: "+max);}
  s.close();
 }
}
