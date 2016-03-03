package AbstractClasses.Challenge.TimsVersion;

public class MyLinkedList implements NodeList {
   private ListItem root = null;

   public MyLinkedList(ListItem root) {
      this.root = root;
   }

   @Override
   public ListItem getRoot() {
      return this.root;
   }

   @Override
   public boolean addItem(ListItem newItem) {
      if (this.root == null) {
         // list was empty - this item becomes a head
         this.root = newItem;
         return true;
      }
      ListItem currentItem = this.root;
      while (currentItem != null) {
         int comparison = currentItem.compareTo(newItem);
         if (comparison < 0) {
            //new item is greater, move right if possible
            if (currentItem.next() != null) {
               currentItem = currentItem.next();
            } else {
               //there is no next, insert at the end of the list
               currentItem.setNext(newItem).setPrevious(currentItem);
               return true;
            }
         } else if (comparison > 0) {
            //new item is less
            if (currentItem.previous() != null) {
               currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
               newItem.setNext(currentItem).setPrevious(newItem);
            } else {
               // the node with previous is the root
               newItem.setNext(this.root).setPrevious(newItem);
               this.root = newItem;
            }
            return true;
         } else {
            // equal
            System.out.println(newItem.getValue() + " is already present");
            return false;
         }
      }
      return false;
   }

   @Override
   public boolean removeItem(ListItem listItem) {
      return false;
   }

   @Override
   public void traverse(ListItem root) {
      if (root == null) {
         System.out.println("The list is empty");
      } else {
         while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
         }
      }
   }
}
