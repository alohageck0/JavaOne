public class Main {
   public static void main(String[] args) {
      //test
//      int val = 1;
//      if (val==1){
//         System.out.println("Value was 1");
//      }
      int switchValue = 4;
      switch (switchValue) {
         case 1:
            System.out.println("Value was 1");
            break;
         case 2:
            System.out.println("Value was 2");
            break;
         case 3:
         case 4:
         case 5:
            System.out.println("Value was 3 or 4 or 5");
            System.out.println("Actually it was " + switchValue);
            break;
         default:
            System.out.println("Was not above");
            break;
      }
      //More code here

      char newChar = 'B';
      switch (newChar) {
         case 'A':
         case 'B':
         case 'C':
         case 'D':
         case 'E':
            System.out.println("Char was " + newChar);
            break;
         default:
            System.out.println("Char not found");
            break;
      }

      String month = "JanuAry";
      switch (month.toLowerCase()) {
         case "january":
            System.out.println("Jan");
            break;
         case "june":
            System.out.println("Jun");
            break;
         default:
            System.out.println("No month");
      }
   }
}
