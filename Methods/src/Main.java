public class Main {
   public static void main(String[] args) {
      calculateScore();

   }

   public static void calculateScore() {
      boolean gameOver = true;
      int score = 4000;
      int levelCompleted = 5;
      int bonus = 100;

      if (gameOver) {
         int finalScore = score + (levelCompleted * bonus);
         System.out.println(finalScore);
      }
   }
}

