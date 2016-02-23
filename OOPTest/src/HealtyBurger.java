public class HealtyBurger extends Hamburger {
   private String addition5;
   private String addition6;

   public HealtyBurger(double price) {
      super("Rye bread", "beef", price);
   }

   @Override
   public void addAdditionToPrice(String addition) {
      super.addAdditionToPrice(addition);
      if (addition.toLowerCase().equals("mustard")) {
         setPrice(getPrice() + 0.6);
      } else if (addition.toLowerCase().equals("olive")) {
         setPrice(getPrice() + 0.45);
      } else {

      }
   }

   public void setAddition5(String addition) {
      this.addition5 = addition;
      addAdditionToPrice(addition);
   }

   public void setAddition6(String addition6) {
      this.addition6 = addition6;
      addAdditionToPrice(addition6);
   }
}
