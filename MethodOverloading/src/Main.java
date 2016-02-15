public class Main {
   public static void main(String[] args) {
//      int newScore = calcScore("test", 500);
//      System.out.println(newScore);
//      calcScore(6000);
//      calcScore();
      System.out.println(calcFeetAndInchesToCentimeters(5, 6));
      System.out.println(calcFeetAndInchesToCentimeters(6, 0));
      System.out.println(calcFeetAndInchesToCentimeters(0, 5));
      System.out.println(calcFeetAndInchesToCentimeters(66));
      System.out.println(calcFeetAndInchesToCentimeters(-10));

   }

   private static int calcScore() {
      System.out.println("No player name, no score");
      return 0;
   }


   public static int calcScore(String name, int score) {
      System.out.println("Player " + name + " scored " + score + " points");
      return score * 1000;
   }

   public static int calcScore(int score) {
      System.out.println("Unnamed player scored " + score + " points");
      return score * 1000;
   }

   public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
      if (!(feet >= 0 && (inches >= 0 && inches <= 12))) {
         return -1;
      }
      return (feet * 12 + inches) * 2.54;
   }

   public static double calcFeetAndInchesToCentimeters(double inches) {
      if (!(inches >= 0)) {
         return -1;
      }
      double feet = (int) inches / 12;
      return calcFeetAndInchesToCentimeters(feet, inches % 12);
   }
}
