package AbstractClasses.Challenge.TimsVersion;

public class Main {
   public static void main(String[] args) {
      MyLinkedList myLinkedList = new MyLinkedList(null);
      myLinkedList.traverse(myLinkedList.getRoot());

      String stringData = "4 5 2 3 6 9 8 27 9 4";

      String[] data = stringData.split(" ");
      for (String s : data) {
         myLinkedList.addItem(new Node(s));
      }

      myLinkedList.traverse(myLinkedList.getRoot());

myLinkedList.removeItem(new Node("4"));
      myLinkedList.traverse(myLinkedList.getRoot());
myLinkedList.removeItem(new Node("6"));
      myLinkedList.traverse(myLinkedList.getRoot());
myLinkedList.removeItem(new Node("27"));
      myLinkedList.traverse(myLinkedList.getRoot());
myLinkedList.removeItem(new Node("8"));
      myLinkedList.traverse(myLinkedList.getRoot());

   }
}
