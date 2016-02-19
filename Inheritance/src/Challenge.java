public class Challenge {
   public static void main(String[] args) {

      Subaru wrx = new Subaru("New", "WRS STI", "WR Blue", 200, "Sedan", true, true);
      wrx.startMove(10);
      wrx.speedUp(70);
      wrx.slowDown(15);
      wrx.turnLeft();
      wrx.turnRight();
      wrx.slowDown(200);
   }

}
