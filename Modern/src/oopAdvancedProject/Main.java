package oopAdvancedProject;

public class Main {

   public static void main(String[] args) {
      CarSale car1 = new CarSale("Honda", 1223, 14);
      CarSale car2 = new CarSale("Honda", 200, 50);
      CarSale car3 = new CarSale("Honda", 13333, 13);
      System.out.println(car1.toString());

      PaperclipSale clip = new PaperclipSale("black", 1200, 3);
      PaperclipSale clip1 = new PaperclipSale("black", 17, 3);
      PaperclipSale clip2 = new PaperclipSale("black", 1200, 3);
      System.out.println(clip.toString());

      Sale[] sales = {car1, car2, car3, clip, clip1, clip2};
      Sale[] sales1 = {};

      System.out.println(Sale.cheapest(sales));
      System.out.println(Sale.totalCost(sales));
      System.out.println(Sale.cheapest(sales1));
      System.out.println(Sale.totalCost(sales1));


      System.out.println(Coin.flip().toString());
      System.out.println(Coin.flip().toString());
      System.out.println(Coin.flip().toString());
      System.out.println(Coin.flip().toString());
      System.out.println(Coin.flip().toString());
   }

}
