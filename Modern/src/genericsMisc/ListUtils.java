package genericsMisc;


import oop.shapes_interface.Circle;

import java.util.Arrays;
import java.util.List;

public class ListUtils {
   public static void main(String[] args) {
      List<Circle> listOfCircles;
      Circle[] circleList = {new Circle(1), new Circle(2), new Circle(3)};
      listOfCircles = Arrays.asList(circleList);
      Circle lastCircle = ListUtils.lastEntry(listOfCircles);
      System.out.println(lastCircle.getArea());

      List<String> wordList;
      String[] stringList = {"111", "222", "333"};

      wordList = Arrays.asList(stringList);
      String lastWord = ListUtils.lastEntry(wordList);
      System.out.println(lastWord);
   }

   static <T> T lastEntry(List<T> list) {
      if (list.size() > 0) {
         return list.get(list.size() - 1);
      } else {
         return null;
      }
   }
}
