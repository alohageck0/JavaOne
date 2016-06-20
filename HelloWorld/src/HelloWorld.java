import java.util.Arrays;

public class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello, World!");
      int myFirstNumber = 5;
      int second = 6;
      int third = 222;

      int total = myFirstNumber + second + third;

      int newTotal = 1000 - total;
      System.out.println(newTotal);

      int[] unsorted = {5, 4, 3, 2, 1, 0};
      sort(unsorted);
      System.out.println(Arrays.toString(unsorted));

   }

   public static void sort(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 1; j < arr.length - i; j++) {
            if (arr[j - 1] > arr[j]) {
               int temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
            }
         }
      }
   }
}
