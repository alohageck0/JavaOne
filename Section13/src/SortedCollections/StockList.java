package SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
   private final Map<String, StockItem> list;

   public StockList() {
      this.list = new HashMap<>();
   }

   public int addStock(StockItem item) {
      if (item != null) {
         //check if already have quantities
         StockItem inStock = list.getOrDefault(item.getName(), item);
         //if there are already stocks on this item, adjust quantity
         if (inStock != item) {
            item.adjustStock(inStock.quantityInStock());
         }
         list.put(item.getName(), item);
         return item.quantityInStock();
      }
      return 0;
   }

   public int sellStock(String item, int quantity) {
      StockItem inStock = list.getOrDefault(item, null);
      if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
         inStock.adjustStock(-quantity);
         return quantity;
      }
      return 0;
   }

   public StockItem get(String itemName) {
      return this.get(itemName);
   }

   public Map<String, StockItem> Items() {
      return Collections.unmodifiableMap(list);
   }

   @Override
   public String toString() {
      String s = "\nStock List\n";
      double totalCost = 0.0;
      for (Map.Entry<String, StockItem> itemEntry : list.entrySet()) {
         StockItem stockItem = itemEntry.getValue();

         double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
         s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
         s = s + itemValue + "\n";
         totalCost += itemValue;

      }
      return s + "Total stock value " + totalCost;
   }

}