import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      //tes
//todat
      Customer customer = new Customer("Tim", 442.23);

      Customer anotherCust;
      anotherCust = customer;
      anotherCust.setBalance(12.43);
      System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


      ArrayList<Integer> itnList = new ArrayList<>();
      itnList.add(1);
      itnList.add(3);
      itnList.add(4);

      for (int i = 0; i < itnList.size(); i++) {
         System.out.println(i + ": " + itnList.get(i));
      }
      itnList.add(1, 2);

      for (int i = 0; i < itnList.size(); i++) {
         System.out.println(i + ": " + itnList.get(i));
      }
   }
}
