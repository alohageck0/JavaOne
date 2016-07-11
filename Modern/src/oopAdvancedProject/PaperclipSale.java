package oopAdvancedProject;

public class PaperclipSale implements Sale {
   private String color;
   private double boxPrice;
   private int numberOfBoxesSold;
   private double finalPrice;

   public PaperclipSale(String color, double boxPrice, int numberOfBoxesSold) {
      this.color = color;
      this.boxPrice = boxPrice;
      this.numberOfBoxesSold = numberOfBoxesSold;
      this.finalPrice = boxPrice * numberOfBoxesSold;
   }

   @Override
   public String toString() {
      return "PaperclipSale {" +
              "color = '" + color + '\'' +
              ", boxPrice = " + boxPrice +
              ", numberOfBoxesSold = " + numberOfBoxesSold +
              ", finalPrice = " + finalPrice +
              '}';
   }


   @Override
   public double getCost() {
      return boxPrice;
   }
}
