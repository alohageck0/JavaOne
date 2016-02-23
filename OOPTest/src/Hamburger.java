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
      String test = addition.toLowerCase();
      if (test.equals("lettuce")) {
         this.price += 0.5;
      } else if (test.equals("tomato")) {
         this.price += 0.3;
      } else if (test.equals("onion")) {
         this.price += 0.4;
      } else if (test.equals("ketchup")) {
         this.price += 0.1;
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
}
