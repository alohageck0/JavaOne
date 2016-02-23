public class Hamburger {
   private String roll;
   private String meat;
   private double basePrice;
   private double total;
   private String addition1;
   private String addition2;
   private String addition3;
   private String addition4;
   private String additions;

   public Hamburger(String roll, String meat, double price) {
      this.roll = roll;
      this.meat = meat;
      this.total = price;
      this.basePrice = price;
      this.additions = "";
   }

   public void addAdditionToPrice(String addition) {
      if (addition.toLowerCase().equals("lettuce")) {
         this.total += 0.5;
         setAdditions(this.additions.concat(addition + " 0.5\n"));
      } else if (addition.toLowerCase().equals("tomato")) {
         this.total += 0.3;
         setAdditions(this.additions.concat(addition + " 0.3\n"));

      } else if (addition.toLowerCase().equals("onion")) {
         this.total += 0.4;
         setAdditions(this.additions.concat(addition + " 0.4\n"));

      } else if (addition.toLowerCase().equals("ketchup")) {
         this.total += 0.1;
         setAdditions(this.additions.concat(addition + " 0.1\n"));

      } else {
         System.out.println("No such ingredient");

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

   public double getTotal() {

//      System.out.println(this.total);
      return total;

   }

   public void printTotal() {
      System.out.println("Base price = " + getBasePrice() + "\n" + getAdditions() + "Total = " + getTotal() + "\n");
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
