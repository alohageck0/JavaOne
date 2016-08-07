package Exceptions;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.Q;

public class Main {
   public static void main(String[] args) {
      int x = 98;
      int y = 0;
//
//      System.out.println(divideLBYL(x, y));
//      System.out.println(divideEAFP(x, y));
      try {
         test(x, y);
      } catch (ArithmeticException e) {
         System.out.println(e);
      } finally {
         System.out.println("Finally excecuted");
      }

//      int x = getIntEAFP();
      System.out.println("x is " + x);

   }

   private static int getInt() {
      Scanner scanner = new Scanner(System.in);
      return scanner.nextInt();
   }

   private static int getIntLBYL() {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.next();
      boolean isVaid = true;
      for (int i = 0; i < input.length(); i++) {
         if (!Character.isDigit(input.charAt(i))) {
            isVaid = false;
            break;
         }
      }
      if (isVaid) {
         return Integer.parseInt(input);
      }
      return 0;
   }

   private static int getIntEAFP() {
      Scanner scanner = new Scanner(System.in);
      try {
         return scanner.nextInt();
      } catch (InputMismatchException e) {
         return 0;
      }

   }


   private static int divideLBYL(int x, int y) {
      if (y != 0) {
         return x / y;
      } else {
         return 0;
      }
   }

   private static int divideEAFP(int x, int y) {
      try {
         return x / y;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   private static int divide(int x, int y) throws ArithmeticException {
      if (y == 0) {
         throw new ArithmeticException("Test exception");
      }
      return x / y;

   }

   public static void test(int x, int y) {
      System.out.println(divide(x, y));
   }


}
