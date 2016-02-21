public class Main {
   public static void main(String[] args) {
//      Dimensions dimensions = new Dimensions(20, 20, 5);
//      Case theCase = new Case("220B", "dell", "240", dimensions);
//
//      Monitor monitor = new Monitor("27Inch", "Acer", 27, new Resolution(2540, 1404));
//
//      Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v.2.44");
//
//      PC thePC = new PC(theCase, monitor, motherboard);
//
//      thePC.powerUp();

      Dimensions doorDims = new Dimensions(800, 2100);
      Dimensions windowDims = new Dimensions(600, 1400);
      Dimensions tableDims = new Dimensions(1000, 1600);

      Room room = new Room(new RoomWindows(windowDims), 2, new Door("wood", doorDims), new Bed("King"), new RoomTable(tableDims, "brown"));
      room.getWindows().openWindow();
      room.enterRoom();
   }
}
