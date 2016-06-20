import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {

      int[] arr = {9,8,7,6,5,4,3,2,1};

      int[] sorted = sort(arr);

      System.out.println(Arrays.toString(sorted));
   }

   public static int[] sort(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 1; j < arr.length-i; j++) {
            if (arr[j-1] > arr[j]) {
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               System.out.print(".");
            }
         }
      }
      return arr;
   }
}
