package AbstractClasses.Challenge.TimsVersion;

public class Main {
   public static void main(String[] args) {
      SearchTree tree = new SearchTree(null);
      tree.traverse(tree.getRoot());

      String stringData = "4 5 2 3 6 9 8 27 9 4";

      String[] data = stringData.split(" ");
      for (String s : data) {
         tree.addItem(new Node(s));
      }

      tree.traverse(tree.getRoot());
//
//      tree.removeItem(new Node("4"));
//      tree.traverse(tree.getRoot());
//      tree.removeItem(new Node("6"));
//      tree.traverse(tree.getRoot());
//      tree.removeItem(new Node("27"));
//      tree.traverse(tree.getRoot());
//      tree.removeItem(new Node("8"));
//      tree.traverse(tree.getRoot());

   }
}
