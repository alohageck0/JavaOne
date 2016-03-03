package AbstractClasses.Challenge;

public class LinkedList extends ListItem {
   ListItem head;

   public LinkedList(Object value) {
      super(value);
   }


   @Override
   public ListItem getPrevious() {
      return this.previous;
   }

   @Override
   public ListItem getNext() {
      return this.next;
   }

   @Override
   public int compareTo(ListItem listItem) {
      if (listItem.getValue().equals(this.value)){

      }
      return 0;
// else if (listItem.getValue().){
//
//      }
   }

   public void addListItem(Object value) {

   }
}
