package SortedCollections;

public class Main {
   private static StockList stockList = new StockList();

   public static void main(String[] args) {
      StockItem temp = new StockItem("bread", 0.86, 100);
      stockList.addStock(temp);

      temp = new StockItem("Cake", 1.1, 7);
      stockList.addStock(temp);

      temp = new StockItem("car", 12.5, 2);
      stockList.addStock(temp);
      temp = new StockItem("chair", 62.0, 10);
      stockList.addStock(temp);
      temp = new StockItem("cup", 0.5, 200);
      stockList.addStock(temp);
      temp = new StockItem("door", 72.95, 4);
      stockList.addStock(temp);

      temp = new StockItem("juice", 2.5, 25);
      stockList.addStock(temp);

      System.out.println(stockList);
   }
}
