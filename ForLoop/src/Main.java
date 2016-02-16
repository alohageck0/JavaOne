public class Main {
   public static void main(String[] args) {
//      System.out.println("10000 at 2% interest " + calcInterest(10000, 2));
//      for (int i = 8; i >= 2; i--) {
//         System.out.println("10000 at " + i + "% interest " + String.format("%.2f", calcInterest(10000, i)));
//
//      }

      int count = 0;
      for (int i = 35; i < 1000; i++) {
         if (isPrime(i)) {
            System.out.println("Prime number " + i);
            count++;
         }
         if (count == 3) {
            break;
         }
      }

   }

   public static double calcInterest(double amount, double rate) {
      return amount * (rate / 100);
   }

   public static boolean isPrime(int n) {
      if (n == 1) {
         return false;
      }
      for (int i = 2; i <= n / 2; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }
}
