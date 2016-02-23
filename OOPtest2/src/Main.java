public class Main {
   public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "White");
      double price = hamburger.itemazeHam();
      hamburger.addHamburgerAddition1("tomato", 0.27);
      hamburger.addHamburgerAddition2("lettuce", 0.65);
      hamburger.addHamburgerAddition3("Cheese", 0.33);
      hamburger.addHamburgerAddition4("tomato", 0.27);
      price = hamburger.itemazeHam();

   }
}
