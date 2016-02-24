import java.util.ArrayList;

public class GrocerieList {
   private ArrayList<String> groceryList = new ArrayList<>();

   public void addGriceryItem(String item) {
      this.groceryList.add(item);
   }

   public void printGroceryList() {
      System.out.println("You have " + groceryList.size() + " items in eour list");
      for (int i = 0; i < groceryList.size(); i++) {
         System.out.println((i + 1) + ". " + groceryList.get(i));
      }
   }

   private int findItem(String searchItem) {
      return groceryList.indexOf(searchItem);
   }

   private void modifyGroceryItem(int position, String newItem) {
      groceryList.set(position, newItem);
      System.out.println("Grocery item " + (position + 1) + " has modified");
   }

   public void modifyGroceryItem(String current, String newItem) {
      int position = findItem(current);
      if (position >= 0) {
         modifyGroceryItem(position, newItem);
      }
   }

   public ArrayList<String> getGroceryList() {
      return groceryList;
   }

   private void removeGroceryItem(int position) {
      String theItem = groceryList.get(position);
      groceryList.remove(position);
      System.out.println("Item " + theItem + " was removed");
   }

   public void removeGroceryItem(String item) {
      int position = findItem(item);
      groceryList.remove(position);
   }

   public boolean onFile(String searchItem) {
      int position = findItem(searchItem);
      if (position >= 0) {
         return true;
      }
      return false;
   }
}
