package lists;

import oop.shapes_interface.Circle;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class CompareLists {
   static List<Circle> listOfCircles = new LinkedList<>();

   @Test
   public void test() {
      long start = System.currentTimeMillis();
      System.out.println(listOfCircles.get(listOfCircles.size() / 2).getArea());
      long end = System.currentTimeMillis();
      System.out.println(start);
      System.out.println(end);
      System.out.println((end - start));
   }

   static {
      for (double i = 0; i < 2000000; i += 0.1) {
         listOfCircles.add(new Circle(Math.random()));
      }
   }

   public Circle getMiddleElement(List<Circle> circles) {
      if (circles.getClass().getName().equals("LinkedList")) {
         return new Circle(1);
      }
      if (circles.getClass().getName().equals("ArrayList")) {
         return circles.get(circles.size() / 2);
      }
      return null;
   }
}
