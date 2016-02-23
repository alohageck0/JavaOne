public class Hamburger {
   private String name;
   private String roll;
   private String meat;
   private double basePrice;

   private double total;
   private String addition1;
   private double addition1price;

   private String addition2;
   private double addition2price;

   private String addition3;
   private double addition3price;

   private String addition4;
   private double addition4price;

   private String additions;

   public Hamburger(String name, String roll, String meat, double price) {
      this.name = name;
      this.roll = roll;
      this.meat = meat;
      this.total = price;
      this.basePrice = price;
      this.additions = "";
   }

   public void addAdditionToPrice(String addition, double price) {
      this.total += price;
      setAdditions(this.additions.concat(addition + " " + price + "\n"));

   }

   public void setAddition1(String addition1, double price) {
      this.addition1 = addition1;
      this.addition1price = price;
      addAdditionToPrice(addition1, price);
   }

   public void setAddition2(String addition2, double price) {
      this.addition2 = addition2;
      this.addition2price = price;
      addAdditionToPrice(addition2, price);

   }

   public void setAddition3(String addition3, double price) {
      this.addition3 = addition3;
      this.addition3price = price;
      addAdditionToPrice(addition3, price);

   }

   public void setAddition4(String addition4, double price) {
      this.addition4 = addition4;
      this.addition4price = price;
      addAdditionToPrice(addition4, price);

   }

   public double itemazeAdditions() {

//      System.out.println(this.total);
      return total;

   }

   public void printTotal() {
      System.out.println("Base price = " + getBasePrice() + "\n" + getAdditions() + "Total = " + itemazeAdditions() + "\n");
   }

   public void setTotal(double total) {
      this.total = total;
   }

   public String getAdditions() {
      return additions;
   }

   public double getBasePrice() {
      return basePrice;
   }

   public void setAdditions(String additions) {
      this.additions = additions;
   }

   //
//   public String getAddition1() {
//      return addition1;
//   }
//
//   public String getAddition2() {
//      return addition2;
//   }
//
//   public String getAddition3() {
//      return addition3;
//   }
//
//   public String getAddition4() {
//      return addition4;
//   }

}
