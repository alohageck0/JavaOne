public class Main {


   public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("test", "white", "beef", 3.5);
      hamburger.setAddition1("Onion", 22);
      hamburger.setAddition2("Tomato", 23);
      hamburger.printTotal();
      hamburger.setAddition3("Lettuce", 43);
      hamburger.setAddition4("Onion", 2.2);
      hamburger.printTotal();

      HealtyBurger helthy = new HealtyBurger("beef", 2);
      helthy.setAddition1("mustard", 23);
      helthy.printTotal();
      helthy.setAddition6("onion", 22);
      helthy.setAddition5("cheese", 13);
      helthy.printTotal();

      DeluxeBurger deluxeBurger = new DeluxeBurger("test", "beef", 2.5);
      deluxeBurger.setAddition1("tomato", 11);
      deluxeBurger.printTotal();

      deluxeBurger.setAddition2("sdfsdf", 324);
      deluxeBurger.printTotal();

//
//
//      String test = "";
//      test = test.concat("sdfsdf");
//      System.out.println(test);
   }
}
