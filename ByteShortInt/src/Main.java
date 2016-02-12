public class Main {
    public static void main(String[] args) {

        // Integer has a widtw of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("My total = " + myTotal);

        // Byte has a widty of 8
        byte myByteValue = -128;
        byte myNewbyte = (byte) (myByteValue / 2);
        System.out.println(myNewbyte);

        // short has a width of 16
        short myShortValue = -32_768;
        short myNewShort = (short) (myShortValue / 2);

        // long has a width of 64
        // 2 in power 63
        long myLongValue = 100L;


    }
}

