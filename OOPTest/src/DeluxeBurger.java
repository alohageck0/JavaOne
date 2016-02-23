public class DeluxeBurger extends Hamburger {
   private String addition5;
   private String addition6;

   public DeluxeBurger(String roll, String meat, double price) {
      super(roll, meat, price);
      setTotal(super.getTotal() + 1.5);
      setAdditions(getAdditions().concat("Coke 1.0\n"));
      setAdditions(getAdditions().concat("Chips 0.5\n"));
//      this.addition5 = "Coke";
//      this.addition6 = "Chips";
   }
}
