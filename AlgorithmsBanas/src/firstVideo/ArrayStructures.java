package firstVideo;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayStructures {

   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();

      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);

      System.out.println(q.peek());
      System.out.println(q.peek());
      System.out.println(q.peek());
   }
}
