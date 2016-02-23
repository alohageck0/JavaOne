public class Main {
   public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "White");
      double price = hamburger.itemazeHam();
      hamburger.addHamburgerAddition1("tomato", 0.27);
      hamburger.addHamburgerAddition2("lettuce", 0.65);
      hamburger.addHamburgerAddition3("Cheese", 0.33);
      hamburger.addHamburgerAddition4("tomato", 0.27);
      price = hamburger.itemazeHam();


      HealtyBurger healtyBurger = new HealtyBurger("Bacon", 5.67);

      healtyBurger.itemazeHam();
      healtyBurger.addHamburgerAddition1("egg", 5.43);
      healtyBurger.itemazeHam();
      healtyBurger.addHealthAddition1("test", 3.3);
      healtyBurger.addHealthAddition2("test3", 1.3);
      System.out.println(healtyBurger.itemazeHam());


      DeluxeBurger db = new DeluxeBurger();
      db.addHamburgerAddition2("dfsd", 324);
      db.itemazeHam();
   }
}
