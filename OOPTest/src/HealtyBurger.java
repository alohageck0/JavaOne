public class HealtyBurger extends Hamburger {
   private String addition5;
   private String addition6;

   public HealtyBurger(String meat, double price) {
      super("Rye bread", meat, price);
   }

   @Override
   public void addAdditionToPrice(String addition) {
      super.addAdditionToPrice(addition);
      if (addition.toLowerCase().equals("mustard")) {
         setTotal(getTotal() + 0.6);
         setAdditions(getAdditions().concat(addition + " 0.6\n"));

      } else if (addition.toLowerCase().equals("olive")) {
         setTotal(getTotal() + 0.45);
         setAdditions(getAdditions().concat(addition + " 0.45\n"));

      } else {
         System.out.println("No such ingredient");
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
