package oop.shapes_abstract;

import org.testng.annotations.Test;
import org.testng.mustache.StringChunk;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),
                new Rectangle(3, 5),
                new Square(5)};
        System.out.println(Shape.sumArea(shapes));
    }

    @Test
    public void test() {
        reverseString("asdfg");
        System.out.println();
//        System.out.println(reverseString1("asdfg"));
    }

    public void reverseString(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    public String reverseString1(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

}
