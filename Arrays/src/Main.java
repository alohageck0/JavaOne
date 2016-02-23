import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
//      int[] myIntArray = new int[25];// = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////      myIntArray[0] = 45;
////      myIntArray[5] = 50;
//
//      for (int i = 0; i < myIntArray.length; i++) {
//         myIntArray[i] = i * 10;
//      }
//      for (int i = 0; i < myIntArray.length; i++) {
//         System.out.println(myIntArray[i]);
//      }
////      System.out.println(myIntArray[5]);
////      System.out.println(myIntArray[2]);
//      printArray(myIntArray);

      int[] myInt = getIntegers(5);
      for (int i = 0; i < myInt.length; i++) {
         System.out.println("Element " + i + " = " + myInt[i]);
      }
      System.out.println("the Avg is " + getAvg(myInt));

   }

   private static int[] getIntegers(int number) {
      System.out.println("Enter " + number + "integer values. \r");
      int[] values = new int[number];
      for (int i = 0; i < values.length; i++) {
         values[i] = scanner.nextInt();
      }
      return values;
   }

   public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
      }

   }

   public static double getAvg(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      return (double) sum / array.length;
   }
}
