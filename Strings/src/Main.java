import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
//        String myString = "This is a strinf";
//        System.out.println(myString);
//        myString = myString + " and this is more.";
//        System.out.println(myString);
//        myString = myString + " \u00A9";
//        System.out.println(myString);
//
//        String numberString = "250.24";
//        numberString = numberString + "49.94";
//        System.out.println(numberString);
//
//        String lastString = "10";
//        int myInt = 50;
//        lastString = lastString + myInt;
//        System.out.println(lastString);
//        double doubleNum = 12.47;
//        lastString = lastString+doubleNum;
//        System.out.println(lastString);

      String stringToReverse = "asdasdasd";
      StringBuilder stringBuilder = new StringBuilder(stringToReverse);
      System.out.println(stringBuilder.reverse().toString());

      System.out.println(reverseString(stringToReverse));
      System.out.println(reverseRecursively(stringToReverse));

      System.out.println(fibo(10));
      System.out.println(fiboRecursive(10));
      System.out.println(fiboIter(10));
      System.out.println(reverse(12345));

      System.out.println(polindromeNum(8383833));
   }

   public static String reverseString(String string) {
      StringBuilder stringBuilder = new StringBuilder();
      char[] charArr = string.toCharArray();
      for (int i = charArr.length - 1; i >= 0; i--) {
         stringBuilder.append(charArr[i]);
      }
      return stringBuilder.toString();
   }

   private static String reverseRecursively(String string) {
      if (string.length() <= 1) {
         return string;
      }
      return reverseRecursively(string.substring(1)) + string.charAt(0);
   }

   private static int fibo(int number) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (int i = 0; i <= number - 1; i++) {
         if (i < 2) {
            arrayList.add(1);
         } else {
            int nMinus2 = arrayList.get(i - 2);
            int nMinus1 = arrayList.get(i - 1);
            arrayList.add(nMinus1 + nMinus2);
         }

      }
      return arrayList.get(number - 1);
   }

   private static int fiboRecursive(int number) {
      if (number == 1 || number == 2) {
         return 1;
      }
      return fiboRecursive(number - 1) + fiboRecursive(number - 2);
   }

   private static int fiboIter(int number) {
      int fiboImin1 = 1;
      int fiboImin2 = 1;
      int fibo = 0;
      if (number == 1 || number == 2) {
         return 1;
      }
      for (int i = 3; i <= number; i++) {
         fibo = fiboImin1 + fiboImin2;
         fiboImin2 = fiboImin1;
         fiboImin1 = fibo;
      }
      return fibo;
   }

   public static boolean polindromeNum(int number) {
      if (number == reverse(number)) {
         return true;
      }

      return false;
   }

   private static int reverse(int number) {
      int reminder;
      int reverse = 0;
      while (number > 0) {
         reminder = number % 10;
         reverse = reverse * 10 + reminder;
         number /= 10;
      }
      return reverse;
   }
}
