public class DeluxeBurger extends Hamburger {
   public DeluxeBurger() {
      super("Deluxe", "Sausage and Bacon", 14.54, "white");
      super.addHamburgerAddition1("Chips", 2.75);
      super.addHamburgerAddition2("Drink", 1.91);
   }

   @Override
   public void addHamburgerAddition1(String name, double price) {
      System.out.println("Can not add item");
   }

   @Override
   public void addHamburgerAddition2(String name, double price) {
      System.out.println("Can not add item");

   }

   @Override
   public void addHamburgerAddition3(String name, double price) {
      System.out.println("Can not add item");

   }

   @Override
   public void addHamburgerAddition4(String name, double price) {
      System.out.println("Can not add item");

   }
}
