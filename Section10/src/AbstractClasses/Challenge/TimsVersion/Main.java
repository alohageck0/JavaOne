package AbstractClasses.Challenge.TimsVersion;

public class Main {
   public static void main(String[] args) {
      MyLinkedList myLinkedList = new MyLinkedList(null);
      myLinkedList.traverse(myLinkedList.getRoot());

      String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney";

      String[] data = stringData.split(" ");
      for (String s : data) {
         myLinkedList.addItem(new Node(s));
      }

   }
}
