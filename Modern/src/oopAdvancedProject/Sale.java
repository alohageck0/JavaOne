package oopAdvancedProject;

public interface Sale {


   static Double cheapest(Sale[] sales) {
      if (sales.length == 0) {
         return null;
      }
      double result = Double.MAX_VALUE;
      for (Sale sale : sales) {
         if (sale.getCost() < result) {
            result = sale.getCost();
         }
      }
      return result;
   }

   static double totalCost(Sale[] sales) {
      if (sales.length == 0) {
         return 0;
      }
      double sum = 0;
      for (Sale sale : sales) {
         sum += sale.getCost();
      }
      return sum;
   }

   double getCost();

}
