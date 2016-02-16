public class Main {
   public static void main(String[] args) {
//      int count = 1;
//      while (count != 6) {
//         System.out.println(count);
//         count++;
//      }
//      count = 1;
//      while (true) {
//         if (count == 6) {
//            break;
//         }
//         System.out.println(count);
//         count++;
//      }
//
//      count = 6;
//      do {
//         System.out.println(count);
//         count++;
//         if (count > 100) {
//            break;
//         }
//      } while (count != 6);

      int number = 5;
      int finishNum = 20;
      int countNum = 0;
      while (number <= finishNum) {
         if (!isEven(number)) {
            number++;
            continue;
         }
         countNum++;
         System.out.println("Even number " + number);
         number++;
         if (countNum == 5) {
            System.out.println(countNum + " Even numbers found");
            break;
         }
      }


   }

   public static boolean isEven(int n) {
      if (n % 2 == 0) {
         return true;
      } else {
         return false;
      }
   }
}
