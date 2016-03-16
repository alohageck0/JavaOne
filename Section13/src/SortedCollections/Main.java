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

      temp = new StockItem("cup", 0.45, 7);
      stockList.addStock(temp);


      temp = new StockItem("door", 72.95, 4);
      stockList.addStock(temp);

      temp = new StockItem("juice", 2.5, 25);
      stockList.addStock(temp);

      System.out.println(stockList);
      for (String s : stockList.Items().keySet()) {
         System.out.println(s);
      }

      Basket basket = new Basket("Evgenii");
      sellItem(basket, "car", 1);
      System.out.println(basket);

      sellItem(basket,"car",1);
      System.out.println(basket);

      sellItem(basket,"car",1);
      sellItem(basket,"spanner",5);
      System.out.println(basket);

      sellItem(basket,"juice",4);
      sellItem(basket,"cup",12);
      sellItem(basket,"bread",1);
      System.out.println(basket);
      System.out.println(stockList);

   }

   public static int sellItem(Basket basket, String item, int quantity) {
      //retreive item from stock
      StockItem stockItem = stockList.get(item);
      if (stockItem == null) {
         System.out.println("We do not's sell " + item);
         return 0;
      }
      if (stockList.sellStock(item, quantity) != 0) {
         basket.addToBasket(stockItem, quantity);
         return quantity;
      }
      return 0;
   }
}
