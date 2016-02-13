public class Challenge {
    public static void main(String[] args) {
        byte myByte = 44;
        short myShort = 65;
        int myInt = 17;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(myLong);
        System.out.println(shortTotal);

    }
}
