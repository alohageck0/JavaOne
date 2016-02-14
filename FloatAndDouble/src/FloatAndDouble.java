public class FloatAndDouble {
    public static void main(String[] args) {
        //width of int 32 4 bytes
        int myIntValue = 5 / 3;

        //width 32 - 4 bytes
        float myFloat = 5f / 3f;
        //width 64 = 8bytes
        double myDouble = 5d / 3d;

        System.out.println("my int value=" + myIntValue);
        System.out.println("my float value=" + myFloat);
        System.out.println("my double value=" + myDouble);


        double pounds = 400d;
        double result = pounds * 0.45359237d;
        System.out.println("KGs = " + result);
        double pi = 3.14_15927d;
    }
}
