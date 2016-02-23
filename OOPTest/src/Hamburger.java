public class Hamburger {
   private String roll;
   private String meat;
   private double price;
   private String addition1;
   private String addition2;
   private String addition3;
   private String addition4;

   public Hamburger(String roll, String meat, double price) {
      this.roll = roll;
      this.meat = meat;
      this.price = price;
   }

   public void addAdditionToPrice(String addition) {
      if (addition.toLowerCase().equals("lettuce")) {
         this.price += 0.5;
      } else if (addition.toLowerCase().equals("tomato")) {
         this.price += 0.3;
      } else if (addition.toLowerCase().equals("onion")) {
         this.price += 0.4;
      } else if (addition.toLowerCase().equals("ketchup")) {
         this.price += 0.1;
      } else {

      }
   }

   public void setAddition1(String addition1) {
      this.addition1 = addition1;
      addAdditionToPrice(addition1);
   }

   public void setAddition2(String addition2) {
      this.addition2 = addition2;
      addAdditionToPrice(addition2);

   }

   public void setAddition3(String addition3) {
      this.addition3 = addition3;
      addAdditionToPrice(addition3);

   }

   public void setAddition4(String addition4) {
      this.addition4 = addition4;
      addAdditionToPrice(addition4);

   }

   public double getPrice() {
      System.out.println(this.price);
      return price;

   }

   public void setPrice(double price) {
      this.price = price;
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
