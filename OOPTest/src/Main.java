public class Main {


   public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("test", "beef", 3.5);
      hamburger.setAddition1("Onion");
      hamburger.setAddition2("Tomato");
      hamburger.printTotal();
      hamburger.setAddition3("Lettuce");
      hamburger.setAddition4("Onion");
      hamburger.printTotal();

      HealtyBurger helthy = new HealtyBurger("beef", 2);
      helthy.setAddition1("mustard");
      helthy.printTotal();
      helthy.setAddition6("onion");
      helthy.printTotal();

      DeluxeBurger deluxeBurger = new DeluxeBurger("test", "beef", 2.5);
      deluxeBurger.setAddition1("tomato");
      deluxeBurger.printTotal();
//
//
//      String test = "";
//      test = test.concat("sdfsdf");
//      System.out.println(test);
   }
}
