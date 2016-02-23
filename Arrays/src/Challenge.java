import java.util.Scanner;

public class Challenge {
   public static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      int[] myInt = getIntegers(5);
      printArray(myInt);
      sortArr(sortArr(myInt));
   }

   public static int[] getIntegers(int num) {
      int[] arr = new int[num];
      for (int i = 0; i < num; i++) {
         arr[i] = scanner.nextInt();
      }
      return arr;
   }

   public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
      }
   }

   public static int[] sortArr(int[] arr) {
      int[] sorted = arr;
      boolean unsorted = true;
      while (unsorted) {
         for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] < sorted[i + 1]) {
               unsorted = true;
            }
         }
         for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] < sorted[i + 1]) {
               int temp = sorted[i];
               sorted[i] = sorted[i + 1];
               sorted[i + 1] = temp;
            }
         }
      }
      return sorted;
   }
}
