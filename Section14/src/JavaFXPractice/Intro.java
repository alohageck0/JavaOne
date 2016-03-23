package JavaFXPractice;

public class Intro {
   public static void main(String[] args) {
      //start
      //
      StairCase(6);
   }

   static void StairCase(int n) {
      String[] arr = new String[n];
      for (int i = 0; i < n; i++) {
         arr[i] = " ";

      }
      for (int i = n - 1; i >= 0; i--) {
         arr[i] = "#";
         for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
         }
         System.out.println();
      }
   }

   static long sumOfIntegers(int[] arr) {
      long sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
      }
      return sum;
   }
}
