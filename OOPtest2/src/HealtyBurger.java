public class HealtyBurger extends Hamburger {
   private String helthyExtra1Name;
   private double helthyExtra1price;
   private String helthyExtra2Name;
   private double helthyExtra2price;

   public HealtyBurger(String meat, double price) {
      super("Healthy", meat, price, "Brown Rye");
   }

   public void addHealthAddition1(String name, double price) {
      this.helthyExtra1Name = name;
      this.helthyExtra1price = price;
   }

   public void addHealthAddition2(String name, double price) {
      this.helthyExtra2Name = name;
      this.helthyExtra2price = price;
   }

   @Override
   public double itemazeHam() {
      double hamburgerPrice = super.itemazeHam();
      if (this.helthyExtra1Name != null) {
         hamburgerPrice += helthyExtra1price;
         System.out.println("Added " + this.helthyExtra1Name + " for an extra " + this.helthyExtra1price);
      }
      if (this.helthyExtra2Name != null) {
         hamburgerPrice += helthyExtra2price;
         System.out.println("Added " + this.helthyExtra2Name + " for an extra " + this.helthyExtra2price);
      }
      return hamburgerPrice;
   }
}
