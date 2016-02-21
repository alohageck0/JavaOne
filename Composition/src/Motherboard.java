public class Motherboard {
   private String model;
   private String manugacturer;
   private int ramSlots;
   private int cardSlots;
   private String bios;

   public Motherboard(String model, String manugacturer, int ramSlots, int cardSlots, String bios) {
      this.model = model;
      this.manugacturer = manugacturer;
      this.ramSlots = ramSlots;
      this.cardSlots = cardSlots;
      this.bios = bios;
   }

   public void loadProg(String progname) {
      System.out.println("Program loading " + progname);
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getManugacturer() {
      return manugacturer;
   }

   public void setManugacturer(String manugacturer) {
      this.manugacturer = manugacturer;
   }

   public int getRamSlots() {
      return ramSlots;
   }

   public void setRamSlots(int ramSlots) {
      this.ramSlots = ramSlots;
   }

   public int getCardSlots() {
      return cardSlots;
   }

   public void setCardSlots(int cardSlots) {
      this.cardSlots = cardSlots;
   }

   public String getBios() {
      return bios;
   }

   public void setBios(String bios) {
      this.bios = bios;
   }
}
