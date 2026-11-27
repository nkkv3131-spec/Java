import java.util.Scanner;
public class Q19_AddMatrices {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);System.out.print("Rows and columns: ");int r=s.nextInt(),c=s.nextInt();
  int[][] a=new int[r][c],b=new int[r][c],sum=new int[r][c];
  System.out.println("Enter first matrix:");for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();
  System.out.println("Enter second matrix:");for(int i=0;i<r;i++)for(int j=0;j<c;j++)b[i][j]=s.nextInt();
  for(int i=0;i<r;i++)for(int j=0;j<c;j++)sum[i][j]=a[i][j]+b[i][j];
  System.out.println("Sum matrix:");for(int[] row:sum){for(int v:row)System.out.print(v+" ");System.out.println();}s.close();
 }
}
