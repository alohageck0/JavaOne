package Basic;

import java.util.Random;

public class ArrayTest {
   public static void main(String[] args) {
      oneStepAllocation();
      twoStepAllocation();
   }

   private static void oneStepAllocation() {
      Random random = new Random();
      float[] arr = {random.nextFloat(), random.nextFloat(), random.nextFloat(), random.nextFloat()};
      for (int i = 0; i < arr.length; i++) {
//         arr[i] = random.nextInt(5000);
         System.out.println(arr[i]);
      }
   }

   private static void twoStepAllocation() {
      Random random = new Random();
      float[] arr = new float[100];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = random.nextFloat();
      }

      for (int i = 0; i < arr.length; i++) {
         System.out.println(Math.sqrt((double) arr[i]));
      }
   }
}
