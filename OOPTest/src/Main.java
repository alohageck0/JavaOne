public class Main {


   public static void main(String[] args) {
      Hamburger hamburger = new Hamburger("test", "beef", 3.5);
      hamburger.getPrice();
      hamburger.setAddition1("Onion");
      hamburger.setAddition2("Tomato");
      hamburger.getPrice();
      hamburger.setAddition3("Lettuce");
      hamburger.getPrice();
      hamburger.setAddition4("Onion");
   }
}
