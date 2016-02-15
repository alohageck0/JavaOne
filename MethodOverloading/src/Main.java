public class Main {
   public static void main(String[] args) {
      int newScore = calcScore("test", 500);
      System.out.println(newScore);
   }

   public static int calcScore(String name, int score) {
      System.out.println("Player " + name + " scored " + score + " points");
      return score * 1000;
   }
}
