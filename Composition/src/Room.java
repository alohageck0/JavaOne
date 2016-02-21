public class Room {
   public RoomWindows windows;
   public int windowsAmmount;
   public Door door;
   public Bed bed;
   public RoomTable table;

   public Room(RoomWindows windows, int windowsAmmount, Door door, Bed bed, RoomTable table) {
      this.windows = windows;
      this.windowsAmmount = windowsAmmount;
      this.door = door;
      this.bed = bed;
      this.table = table;
   }

   public void enterRoom() {
      door.openDoor();
      System.out.println("You entered the room");
   }

   public RoomWindows getWindows() {
      return windows;
   }
}
