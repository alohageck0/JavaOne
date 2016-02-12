public class Challenge {
    public static void main(String[] args) {
        byte myByte = 44;
        short myShort = 6534;
        int myInt = 17_373_343;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
