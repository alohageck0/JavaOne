package AbstractClasses.Challenge;

public abstract class ListItem {
   Object value;
   ListItem previous;
   ListItem next;

   public ListItem(Object value) {
      this(value, null);
   }

   public ListItem(Object value, ListItem listItem) {
      this.value = value;
      this.previous = listItem;
      this.next = null;
   }

   public Object getValue() {
      return this.value;
   }

   public abstract ListItem getPrevious();

   public abstract ListItem getNext();

   public void setPrevious(ListItem previous) {
      this.previous = previous;
   }

   public void setNext(ListItem next) {
      this.next = next;
   }

   public abstract int compareTo(ListItem listItem);
}
