public class DeluxeBurger extends Hamburger {
   private String addition5;
   private String addition6;

   public DeluxeBurger(String roll, String meat, double price) {
      super("deluxe", roll, meat, price);
      super.setAddition1("coke", 12);
      super.setAddition2("chips", 10);
//      setTotal(super.itemazeAdditions() + 1.5);
//      setAdditions(getAdditions().concat("Coke 1.0\n"));
//      setAdditions(getAdditions().concat("Chips 0.5\n"));
////      this.addition5 = "Coke";
//      this.addition6 = "Chips";
   }

   @Override
   public void setAddition1(String addition, double price) {
      System.out.println("Can not add " + addition);
   }

   @Override
   public void setAddition2(String addition, double price) {
      System.out.println("Can not add " + addition);

   }

   @Override
   public void setAddition3(String addition, double price) {
      System.out.println("Can not add " + addition);

   }

   @Override
   public void setAddition4(String addition, double price) {
      System.out.println("Can not add " + addition);

   }
}
