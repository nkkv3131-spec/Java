import java.util.Arrays;
public class Q01_SortArrays {
 public static void main(String[] args) {
  int[] a={23,3,5,2,4}; String[] b={"Rama","Krishna","Sita"};
  Arrays.sort(a); Arrays.sort(b);
  System.out.println("Sorted numbers: "+Arrays.toString(a));
  System.out.println("Sorted strings: "+Arrays.toString(b));
 }
}
