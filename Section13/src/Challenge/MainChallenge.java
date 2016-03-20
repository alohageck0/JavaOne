package Challenge;

import java.util.Map;

public class MainChallenge {
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

//      System.out.println(stockList);
//      for (String s : stockList.Items().keySet()) {
//         System.out.println(s);
//      }

      Basket basket = new Basket("Evgenii");
      Basket bin1 = new Basket("test");
      reserveItem(basket, "car", 1);
      reserveItem(bin1,"car",1);
      System.out.println(basket);
      System.out.println(bin1);

      reserveItem(basket, "car", 1);
      System.out.println(basket);

      reserveItem(basket, "car", 1);
      unreserveItem(basket, "car", 1);
      System.out.println(stockList.get("car").getReserved());
      reserveItem(basket, "spanner", 5);
      System.out.println(basket);

      reserveItem(basket, "juice", 4);
      unreserveItem(basket,"dfsdfs",23);
      reserveItem(basket, "cup", 12);
      reserveItem(basket, "bread", 1);
      System.out.println(basket);
      System.out.println(stockList);

      checkOutBasket(basket);

      System.out.println(stockList);

//todo unreserve functionality
   }

   public static int reserveItem(Basket basket, String item, int quantity) {
      //retreive item from stock
      StockItem stockItem = stockList.get(item);
      if (stockItem == null) {
         System.out.println("We do not's sell " + item);
         return 0;
      }
      if (stockList.reserveStock(item, quantity) > 0) {
         basket.addToBasket(stockItem, quantity);
         return quantity;
      }
      return 0;
   }

   public static int unreserveItem(Basket basket, String item, int quantity) {
      System.out.println("unreserving "+ item);
      StockItem stockItem = stockList.get(item);
      if (stockItem!=null){
         stockItem.unreserveItems(quantity);
         return basket.removeFormBasket(stockItem, quantity);

      }else {
         System.out.println("there is no such an item");
      }
      return 0;
   }

   public static void checkOutBasket(Basket basket) {
      for (Map.Entry<StockItem, Integer> entry : basket.Items().entrySet()) {
         stockList.checkOut(entry.getKey(), entry.getValue());
      }
      basket.clearBasket();
   }

}
