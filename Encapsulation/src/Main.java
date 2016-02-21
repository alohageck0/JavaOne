public class Main {
   public static void main(String[] args) {
//      Player player = new Player();
//      player.name = "tim";
//      player.health = 20;
//      player.weapon = "Sword";
//
//      int damage = 10;
//      player.loseHealth(damage);
//      System.out.println("remainig health " + player.healthRemaining());
//
//      damage = 11;
//      player.health = 200;
//      player.loseHealth(damage);
//      System.out.println("remainig health " + player.healthRemaining());
//
//      EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Sword");
//      System.out.println("Health is " + player.getHealth());

      Printer epson = new Printer(60, false);
      epson.printPage(14);
      epson.getPagesPrinted();
      System.out.println(epson.getTonerLevel());
      epson.fillUpToner();
      System.out.println(epson.getTonerLevel());

      epson.printPage(200);
      System.out.println(epson.getTonerLevel());

   }
}
