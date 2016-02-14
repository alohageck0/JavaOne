public class Main {
    public static void main(String[] args) {
        String myString = "This is a strinf";
        System.out.println(myString);
        myString = myString + " and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9";
        System.out.println(myString);

        String numberString = "250.24";
        numberString = numberString + "49.94";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNum = 12.47;
        lastString = lastString+doubleNum;
        System.out.println(lastString);
    }
}
