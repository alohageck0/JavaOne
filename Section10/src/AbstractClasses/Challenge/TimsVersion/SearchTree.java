package AbstractClasses.Challenge.TimsVersion;

public class SearchTree implements NodeList {
   private ListItem root = null;

   public SearchTree(ListItem root) {
      this.root = root;
   }

   @Override
   public ListItem getRoot() {
      return this.root;
   }

   @Override
   public boolean addItem(ListItem newItem) {
      if (this.root == null) {
         // the tree was empty - this item becomes a head
         this.root = newItem;
         return true;
      }
      //otherwise start comparing from the head of the tree
      ListItem currentItem = this.root;
      while (currentItem != null) {
         int comparison = currentItem.compareTo(newItem);
         if (comparison < 0) {
            //new item is greater, move right if possible
            if (currentItem.next() != null) {
               currentItem = currentItem.next();
            } else {
               //there is no node to the right, so add at this point
               currentItem.setNext(newItem);
               return true;
            }
         } else if (comparison > 0) {
            //new item is less, move left if possible
            if (currentItem.previous() != null) {
               currentItem = currentItem.previous();
            } else {
               // there is no node to the left, so add at this point
               currentItem.setPrevious(newItem);
               return true;
            }
         } else {
            // equal, so don't add
            System.out.println(newItem.getValue() + " is already present");
            return false;
         }
      }
      //we can't actually get here, but Java complains if there is no return
      return false;
   }

   @Override
   public boolean removeItem(ListItem listItem) {
      return false;
   }

   @Override
   public void traverse(ListItem root) {
//recursive method
      if (root != null) {
         traverse(root.previous());
         System.out.println(root.getValue());
         traverse(root.next());
      }
   }
}
