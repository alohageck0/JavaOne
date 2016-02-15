public class Main {
   public static void main(String[] args) {
      boolean gameOver = true;
      int score = 4000;
      int levelCompleted = 5;
      int bonus = 100;

      int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
      System.out.println("Your final score " + highscore);


      highscore = calculateScore(true, 10000, 8, 200);
      System.out.println("Your final score " + highscore);

      displayHighScorePosition("Test", 1500);
      displayHighScorePosition("Test", 900);
      displayHighScorePosition("Test", 400);
      displayHighScorePosition("Test", 50);
      displayHighScorePosition("Test", 1000);

   }

   public static int calculateScore(boolean gameOver, int score,
                                    int levelCompleted, int bonus) {
      if (gameOver) {
         int finalScore = score + (levelCompleted * bonus);
         finalScore += 1000;
         return finalScore;
      }
      return -1;
   }

   public static void displayHighScorePosition(String name, int highscore) {
      System.out.println(name + " managed to get into position " +
              calculateHighScorePosition(highscore) + " on the high score table");
   }

   public static int calculateHighScorePosition(int score) {
      if (score >= 1000) {
         return 1;
      } else if (score >= 500 && score < 1000) {
         return 2;
      } else if (score >= 100 && score < 500) {
         return 3;
      } else {
         return 4;
      }
   }
}

