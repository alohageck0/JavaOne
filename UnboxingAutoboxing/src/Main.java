import java.util.ArrayList;


class IntClass {
   private int muVal;

   public IntClass(int muVal) {
      this.muVal = muVal;
   }

   public int getMuVal() {
      return muVal;
   }

   public void setMuVal(int muVal) {
      this.muVal = muVal;
   }
}

public class Main {
   public static void main(String[] args) {
      String[] strArr = new String[10];
      int[] intArr = new int[10];

      ArrayList<String> strArrList = new ArrayList<>();
      strArrList.add("Tim");

      ArrayList<IntClass> intArrList = new ArrayList<>();
      intArrList.add(new IntClass(54));

      Integer integer = new Integer(54);
      Double doubleVal = new Double(2.4);
      ArrayList<Integer> intArrlist = new ArrayList<>();
      intArrlist.add(33);
      for (int i = 0; i <= 10; i++) {
         intArrlist.add(Integer.valueOf(i));
      }

//      for (int i = 0; i <= 10; i++) {
//         System.out.println(intArrlist.get(i).intValue());
//      }

      Integer myIntVal = 56;//Integer.valueOf(56);

      int myInt = myIntVal; //myIntVal.intValue();


      ArrayList<Double> myDoubVal = new ArrayList<>();
      for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
         myDoubVal.add(dbl);
      }

      for (int i = 0; i < myDoubVal.size(); i++) {
         System.out.println(myDoubVal.get(i));
      }

   }
}
