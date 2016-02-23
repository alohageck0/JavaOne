public class HealtyBurger extends Hamburger {
   private String addition5;
   private String addition6;

   public HealtyBurger(String meat, double price) {
      super("Rye bread", "white", meat, price);
   }

   @Override
   public void addAdditionToPrice(String addition, double price) {
      super.addAdditionToPrice(addition, price);

   }

   public void setAddition5(String addition, double price) {
      this.addition5 = addition;
      addAdditionToPrice(addition, price);
   }

   public void setAddition6(String addition6, double price) {
      this.addition6 = addition6;
      addAdditionToPrice(addition6, price);
   }
}
