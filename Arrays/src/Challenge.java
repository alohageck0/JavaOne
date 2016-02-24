import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
   public static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      int[] myInt = getIntegers(5);
//      printArray(myInt);
      printArray(sortArr(myInt));
//        int[] test = {5, 4, 3};
//        int[] test1 = {5, 1, 3};
//        System.out.println(isSorted(test));
//        System.out.println(isSorted(test1));
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
      while (!isSorted(sorted)) {
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

   public static int[] sortArray(int[] array) {
      int[] sorted = Arrays.copyOf(array, array.length);
//      int[] sorted = new int[array.length];
//      for (int i = 0; i < sorted.length; i++) {
//         sorted[i] = array[i];
//      }
      boolean flag = true;
      int temp;
      while (flag) {
         flag = false;
         for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] < sorted[i + 1]) {
               temp = sorted[i];
               sorted[i] = sorted[i + 1];
               sorted[i + 1] = temp;
               flag = true;
            }
         }
      }
      return sorted;
   }

   public static boolean isSorted(int[] arr) {
      boolean sorted = true;
      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] < arr[i + 1]) {
            sorted = false;
         }
      }
      return sorted;
   }
}
