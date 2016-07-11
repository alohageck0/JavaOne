package oopAdvancedProject;

public class CarSale implements Sale {
   private String modelName;
   private double listPrice;
   private int discountPercent;
   private double finalPrice;

   public CarSale(String modelName, double listPrice, int discountPercent) {
      this.modelName = modelName;
      this.listPrice = listPrice;
      this.discountPercent = discountPercent;
      this.finalPrice = listPrice - listPrice * discountPercent / 100;
   }

   @Override
   public String toString() {
      return "CarSale {" +
              "modelName = '" + modelName + '\'' +
              ", listPrice = " + listPrice +
              ", discountPercent = " + discountPercent +
              ", finalPrice = " + finalPrice +
              '}';
   }


   @Override
   public double getCost() {
      return finalPrice;
   }
//   @Override
//   public String toString() {
//      return "Model name: " + modelName + "\nList price: " + listPrice + "\nDiscount: " + discountPercent + "%" + "\nFinal price " + finalPrice;
//   }
}
