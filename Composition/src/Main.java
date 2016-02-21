public class Main {
   public static void main(String[] args) {
      Dimensions dimensions = new Dimensions(20, 20, 5);
      Case theCase = new Case("220B", "dell", "240", dimensions);

      Monitor monitor = new Monitor("27Inch", "Acer", 27, new Resolution(2540, 1404));

      Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v.2.44");

      PC thePC = new PC(theCase, monitor, motherboard);

      thePC.getMonitor().drawPixelAt(5, 5, "red");

      thePC.getMotherboard().loadProg("Windows 1.0");

      thePC.getTheCase().pressPowerButton();
   }
}
