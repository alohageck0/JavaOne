public class Main {
    public static void main(String[] args) {
//        int result = 1 + 2;
//        System.out.println(result);
//
//        int prevResult = result;
//        result = result - 1;
//
//        System.out.println(prevResult + " " + result);
//        prevResult = result;
//        result = result * 10;
//        System.out.println(prevResult + " *10 = " + result);
//
//        prevResult = result;
//        result = result / 5;
//        System.out.println(prevResult + " /5 = " + result);
//
//        prevResult = result;
//        result = result % 3;
//        System.out.println("reminder " + prevResult + " /3 " + result);
//        result++;
//        System.out.println(result);
//
//        result--;
//        System.out.println(result);
//
//        result += 2;
//        System.out.println(result);
//
//        result *= 10;
//        System.out.println(result);
//
//        result -= 10;
//        System.out.println(result);
//
//        result /= 10;
//        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second " +
                    "top sore and less then 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of this test is true");

        int newVlue = 50;
        if (newVlue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppose to ahppen");
        }

//        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double valOne = 20d;
        double valTwo = 80d;
        double result = (valOne + valTwo) * 25;
        System.out.println("My total = " + result);
        double reminder = result % 40;
        System.out.println(reminder);
        if (reminder <= 20)
            System.out.println("Total was over the limit");

    }
}
